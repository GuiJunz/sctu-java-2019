<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/19
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int number = 12;

    Cookie cookie = new Cookie("number",String.valueOf(number));

%>
该数字的平方和是：<%= number*number%>
</body>
</html>
