package com.wj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wenjing.liu on 2021/2/7 in J1.
 * 单纯依赖javax.servlet来实现一个HttpServlet
 */
@WebServlet(urlPatterns = "/")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String count = req.getParameter("count");
        PrintWriter writer = resp.getWriter();
        writer.write(String.format("<h1> Hello Web %s ,This is a simple web!</h1>",count));
        //强制输出
        writer.flush();
    }
}
