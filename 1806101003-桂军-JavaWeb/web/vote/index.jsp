<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.mode1.Teacher" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/12/3
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四川旅游学院教师投票系统</title>
</head>
<body>

<%
    List<Teacher> teacherList = null;
    if (application.getAttribute("teacherList") == null){
        teacherList = new ArrayList<>();
        Teacher chen = new Teacher();
        chen.setTno("0000926");
        chen.setRealName("张三");
        chen.setVoteNum(0);

        Teacher gui = new Teacher();
        chen.setTno("0000927");
        chen.setRealName("习近平");
        chen.setVoteNum(0);


        teacherList.add(chen);
        teacherList.add(gui);

        application.setAttribute("teacherList",teacherList);
    }else {
        teacherList = (List<Teacher>)application.getAttribute("teacherList");

    }

%>

<%--<%
    teacherList = new ArrayList<>();
    Teacher chen = new Teacher();
    chen.setTno("0000926");
    chen.setRealName("张三");
    chen.setVoteNum(0);
    teacherList.add(chen);
%>--%>


<table cellpadding="10">
    <caption>欢迎给教师投票</caption>
    <tr bgcolor="aqua">
        <td>工号</td>
        <td>姓名</td>
        <td>得票数</td>
        <td>投票</td>
    </tr>
   <%-- <tr>
        <td>1</td>
        <td>张三</td>
        <td>10</td>
        <td><a href="vote.jsp">投票</a></td>
    </tr>--%>
    <%
        for (Teacher teacher : teacherList){
            out.write("<tr>");
            out.write("<td>"+teacher.getTno()+"</td>");
            out.write("<td>"+teacher.getRealName()+"</td>");
            out.write("<td>"+teacher.getVoteNum()+"</td>");
            out.write("<td><a href='vote.jsp?tno="+teacher.getTno()+"'>投票</a></td>");
            out.write("</tr>");
        }
    %>
</table>
</body>
</html>
