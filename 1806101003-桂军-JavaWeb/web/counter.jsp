<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/12
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>counter</title>
</head>
<body>

<%
    int count;

    if(application.getAttribute("count")==null){
        application.setAttribute("count",1);
    }else {
        count = (int) application.getAttribute("count");

        count = count + 1;

        application.setAttribute("count", count);
    }
%>

当前访问人数：${applicationScope.count} 人

</body>
</html>
