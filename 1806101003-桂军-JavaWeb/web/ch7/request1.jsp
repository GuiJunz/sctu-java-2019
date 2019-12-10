<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/19
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= request.getRemoteAddr()%>  <%--请求IP地址--%>
<%= request.getServletPath()%> <%--请求路径--%>
<%= request.getMethod()%>
<%= request.getQueryString()%>
</body>
</html>
