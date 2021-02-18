package com.wj.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 * <p>
 * <p>
 * 创建一个Spring项目
 * 1.pom.xml引入spring-context依赖
 * 2.创建项目需要的java bean
 * 3.添加application-context.xml来配置java bean之间的依赖关系
 * 4.Spring容器通过读取xml文件后反射完成,也就是通过context.getBean获取到该bean
 */

public class RegisterApplication {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml");
        RegisterService service = context.getBean(RegisterService.class);
        //RegisterService service = (RegisterService)context.getBean("registerService");
        User user = service.register("12345678901", "123456");
        System.out.println("注册之后的用户名为：" + user.name);


    }
}
