<%-- ��������������������������� --%>
<%@page language="java" import="java.util.*" contentType="text/html; charset=GB2312"  %>
<html>
    <head>
        <title>First JSP</title>
    </head>

    <body>
    <%-- ����һ��JSPע��ʾ����ʽ --%>
        <h1> ����ͨ�� JSP ��Ⱦ��ҳ��</h1>
        <p>
    <%-- ����һ�����Java����ʾ����ʽ --%>
            <%
                out.println("����ͨ��java���������,��ȡurl�е�keyΪ");

             %>
        <%-- ����Ԫ�ر�ǩ --%>
            <span style="color:yellowgreen">
                <%= request.getParameter("key")%>
            </span>
        </p>
         <p>
             <%-- �����ͱ��������� --%>
             <%! int count = 1;%>
            <%
                out.println(String.format("��ʼ����count��ֵΪ%d",count));
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