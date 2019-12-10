<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/15
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
文章管理页面
<%
    if(session.getAttribute("user") == null) {
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
%>
</body>
</html>
