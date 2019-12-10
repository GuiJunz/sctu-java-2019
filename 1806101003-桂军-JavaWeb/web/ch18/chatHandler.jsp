<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/12/10
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String content = request.getParameter("content");
    //处理聊天内容
    String account = (String) session.getAttribute("account");
    String line = account + "：" + content;
    //整个聊天室第一个人说的第一句话

    if (application.getAttribute("chatList") == null){
        List<String> chatList = new ArrayList<String>();
        chatList.add(line);

        application.setAttribute("chatList",chatList);

    }else {
        List<String> chatList = (List<String>) application.getAttribute("chatList");
        chatList.add(line);
        application.setAttribute("chatList",chatList);
    }
    request.getRequestDispatcher("chatroom.jsp").forward(request,response);
%>
