<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/26
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("ItemList")==null){
        out.write("购物车为空！");
    }else{
        List<String> itemList;
        itemList = (List<String>) session.getAttribute("ItemList");
        for (String item : itemList){
            out.write(item + "<br />");
        }
    }

%>>
</body>
</html>
