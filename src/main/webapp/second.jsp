<%-- 用来解决中文在浏览器乱码的问题 --%>
<%@page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"  %>
<html>
    <head>
        <title>First JSP</title>
    </head>

    <body>
    <%-- 这是一个JSP注释示例方式 --%>
        <h1> 这是通过 JSP 渲染的页面</h1>
        <p>
    <%-- 这是一个添加Java代码示例方式 --%>
            <%
                out.println("这是通过java输出的文字,获取url中的key为");

             %>
        <%-- 行内元素标签 --%>
            <span style="color:yellowgreen">
                <%= request.getParameter("key")%>
            </span>
        </p>
         <p>
             <%-- 方法和变量的声明 --%>
             <%! int count = 1;%>
            <%
                out.println(String.format("初始化的count的值为%d",count));
            %>
        </p>
        <p>
            <%!
                int getCount(){
                    return count;
                }
            %>
        </p>
    </body>
</html>