<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/12
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%
    if (session.getAttribute("username")== null)
        request.getRequestDispatcher("/login.jsp")
            .forward(request, response);
%>--%>
<c:if test="${sessionScope.username == null}">

    <jsp:forward page="/login.jsp"></jsp:forward>

</c:if>

欢迎您，${sessionScope.username} 这是用户个人中心页面。

</body>
</html>
