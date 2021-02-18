package com.wj.spring;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 */

public class RegisterService {
    private MessageService messageService;

    public void setMessageService(MessageService service) {
        this.messageService = service;
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
        if (messageService == null) {
            System.err.println("还没有初始化MessageService");
            return user;
        }
        messageService.sendRegisteSuccessMessage(phone);
        return user;

    }

}
