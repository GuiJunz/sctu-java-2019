<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.mode1.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/12/3
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String tno = request.getParameter("tno");
    List<Teacher> teacherList = (List<Teacher>) application.getAttribute("teacherList");

    for (Teacher teacher : teacherList){
        if (teacher.getTno().equals(tno)){
            teacher.setVoteNum(teacher.getVoteNum() + 1);
        }
    }
    application.setAttribute("teacherList",teacherList);
    request.getRequestDispatcher("/vote/index.jsp").forward(request,response);
%>
