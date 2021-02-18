package com.wj.mvc;

/**
 * Created by wenjing.liu on 2021/2/10 in J1.
 */

public class CustomerController {
    private SqlDataBase sqlDataBase;

    /**
     * 根据用户id获取用户的名字
     *
     * @param memberId
     * @return
     */
    public Customer getCustomer(long memberId) {
        Customer customer = new Customer();
        //模拟查询数据库
        sqlDataBase.query(memberId);
        customer.memberId = memberId;
        customer.memberName = "小刘";
        return customer;
    }
}
