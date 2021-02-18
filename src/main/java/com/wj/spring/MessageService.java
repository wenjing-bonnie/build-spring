package com.wj.spring;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 */

public class MessageService {
    /**
     * 发送短信
     *
     * @param phone
     */
    public void sendRegisteSuccessMessage(String phone) {
        String message = "您已经成功注册该网站账户";
        System.out.println(String.format("已经成功的向%s发送注册短信:%s", phone, message));
    }
}
