package com.wj.mvc;

/**
 * Created by wenjing.liu on 2021/2/10 in J1.
 */

public class CustomerController {
    /**
     * 根据用户id获取用户的名字
     *
     * @param memberId
     * @return
     */
    public Customer getCustomer(long memberId) {
        Customer customer = new Customer();
        customer.memberId = memberId;
        customer.memberName = "小刘";
        return customer;
    }
}
