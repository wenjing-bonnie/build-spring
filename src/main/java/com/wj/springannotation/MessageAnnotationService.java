package com.wj.springannotation;

import org.springframework.stereotype.Component;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 * @Component用来标示一个Bean
 */
@Component
public class MessageAnnotationService {
    /**
     * 发送短信
     *
     * @param phone
     */
    public void sendRegisterSuccessMessage(String phone) {
        String message = "您已经成功注册该网站账户";
        System.out.println(String.format("已经成功的向%s发送注册短信:%s", phone, message));
    }
}
