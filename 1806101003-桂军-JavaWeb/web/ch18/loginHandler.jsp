<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/12/10
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    //接受用户的账号和密码
    String account = request.getParameter("account");
    String password = request.getParameter("password");
    //检查账号和密码是否匹配
    session.setAttribute("account",account);
    //跳转到聊天室界面
    request.getRequestDispatcher("chatroom.jsp")
            .forward(request,response);

%>
