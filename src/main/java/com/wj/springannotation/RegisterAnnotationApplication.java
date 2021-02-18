package com.wj.springannotation;

import com.wj.spring.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 * <p>
 * 使用XML：所有的Bean能一目了然的列出来，并通过注入可直观的看到每个Bean的依赖
 * 缺点：每增加一个组件，都需要将新的Bean配置到XML中
 * 通过注解的方式来完成一个Spring项目，完全不需要XML，Spring自动扫描Bean并组装
 * 创建一个Spring项目
 * 1.pom.xml引入spring-context依赖
 * 2.创建项目需要的java bean
 * 3.通过注解来标示不同的Bean的作用
 */

@Configuration  //用来标明是一个配置类，在创建AnnotationConfigApplicationContext,需要传入该类
@ComponentScan //用来告诉容器，自动扫描当前类所在的包以及子包，把所有标注为@Component的Bean都自动创建出来，并根据@Autowired进行装配

public class RegisterAnnotationApplication {


    public static void main(String[] args) {
       ApplicationContext context = new  AnnotationConfigApplicationContext(RegisterAnnotationApplication.class);

        RegisterAnnotationService service = context.getBean(RegisterAnnotationService.class);
        //RegisterService service = (RegisterService)context.getBean("registerService");
        User user = service.register("12345678901", "123456");
        System.out.println("注册之后的用户名为：" + user.name);


    }
}
