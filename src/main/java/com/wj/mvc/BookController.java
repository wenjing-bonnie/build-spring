package com.wj.mvc;

/**
 * Created by wenjing.liu on 2021/2/18 in J1.
 */

public class BookController {

    private SqlDataBase sqlDataBase;

    /**
     * 根据用户购买的图片获取图书价格，当然在实际的处理要比这个复杂
     *
     * @param name
     * @return
     */
    public Book getBook(String name) {
        Book book = new Book();
        //模拟查询数据库
        sqlDataBase.query(name);
        book.name = name;
        book.price = 39;
        return book;
    }
}
