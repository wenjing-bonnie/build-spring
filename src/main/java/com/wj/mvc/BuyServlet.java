package com.wj.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wenjing.liu on 2021/2/10 in J1.
 */

@WebServlet(urlPatterns = "/buy")
public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //模拟从数据库中根据"name"找到对应的Book实体对象
        String name = req.getParameter("name");
        BookController bookController = new BookController();
        Book book = bookController.getBook(name);
        //模拟从数据库中得到Customer
        CustomerController customerController = new CustomerController();
        Customer customer = customerController.getCustomer(122);
        req.setAttribute("book", book);
        req.setAttribute("customer", customer);
        //交给jsp来动态渲染
        req.getRequestDispatcher("/buy.jsp").forward(req, resp);
    }
}
