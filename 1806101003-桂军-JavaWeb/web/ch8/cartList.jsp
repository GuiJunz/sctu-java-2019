<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/26
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> itemList = (List<String>) session.getAttribute("ItemList");
    for (String item : itemList){
        out.write(item + "</br>");
    }

%>
</body>
</html>
