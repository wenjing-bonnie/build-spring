<%--
  Created by IntelliJ IDEA.
  User: j1
  Date: 2021/2/10
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.wj.mvc.Customer" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wj.mvc.Book" %>
<%
    Customer customer = (Customer) request.getAttribute("customer");
    Book book = (Book) request.getAttribute("book");
%>
<html>
<head>
    <title>Mall</title>
</head>
<body>

    <h1>模拟某网站购物</h1>
    <p>
        亲爱的 <span style="color:red;size: A3;"><%= customer.memberName%></span> 顾客
    </p>
    <p>
        购买的图书为:<span style="color: yellowgreen;size: A3">《<%= book.name%>》</span>
        ,需要付款 <span style="color: yellowgreen;size: A3"><%= book.price%></span> 元
    </p>

</body>
</html>
