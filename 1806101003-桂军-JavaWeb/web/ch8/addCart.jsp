<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/26
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>购物车列表</h1>
<%
    request.setCharacterEncoding("utf-8");
    String item = request.getParameter("item");

    // 第一次放的时候，session没有变量ItemList
    if (session.getAttribute("ItemList") == null ){

        List<String> itemList = new ArrayList<String>();
        itemList.add(item);

        session.setAttribute("ItemList",itemList);
        /*out.write("购物车列表为空");*/
    }else {
        List<String>  itemList = (List<String>) session.getAttribute("ItemList");
        for (String item : itemList){
            out.write(item + "</br>");
        }
    }
%>
</body>
</html>
