package com.wj.springannotation;

import com.wj.spring.SqlDataBase;
import com.wj.spring.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 */
@Component
@Scope("prototype")
public class RegisterAnnotationService {
    //   @Autowired将指定类型的Bean直接注入到指定的字段
    //
    @Autowired
    private MessageAnnotationService messageAnnotationService;

    public void setMessageService(MessageAnnotationService service) {
        this.messageAnnotationService = service;
    }


    public User register(String phone, String password) {
        User user = new User();
        user.phone = phone;
        user.password = password;
        //随机生成一个用户名
        user.name = "小刘";
        //需要将该信息写入数据库
        SqlDataBase sql = new SqlDataBase();
        sql.insert(user);
        //注册成功之后，给用户发送短息
        if (messageAnnotationService == null) {
            System.err.println("还没有初始化MessageService");
            return user;
        }
        messageAnnotationService.sendRegisterSuccessMessage(phone);
        return user;

    }

}
