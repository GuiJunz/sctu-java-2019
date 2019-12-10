
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.sctu.dao.VoteDao" %>
<%@ page import="edu.sctu.dao.VoteDaoImp" %>
<%@ page import="edu.sctu.mode1.Teacher" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sctu教师投票系统</title>
</head>
<body>
<%
    List<Teacher> teacherList=null;
    /*VoteDao voteDao = new VoteDaoImp();
    List<Teacher> teacherList1 = voteDao.selectAll();*/
    VoteDao voteDao = new VoteDaoImp();
    List<Teacher> teacherList1 = voteDao.selectAll();

%>

<center>
    <h1>欢迎来到投票系统</h1>
    <hr>
    <table border="1" cellpadding="10"  cellspacing="2">
        <%--题目--%>
        <caption>欢迎进入投票系统</caption>

        <tr style="background-color:deepskyblue;">
            <td>工号</td>
            <td>姓名</td>
            <td>得票数</td>
            <td>投票</td>
            <%--<td>撤销投票</td>--%>

        </tr>

        <%
            for (Teacher teacher:teacherList1){

                out.write("<tr>");
                out.write("<td>"+teacher.getTno()+"</td>");
                out.write("<td>"+teacher.getRealName()+"</td>");
                out.write("<td>"+teacher.getVoteNum()+"</td>");
                out.write("<td><a href='vote1.jsp?tno="+teacher.getTno()+"'>投票</a></td>");
//                out.write("<td><a href='vote2.jsp?tno="+teacher.getTno()+"'>撤销投票</a></td>");
                out.write("</tr>");

            }
        %>
    </table>

</center>
</body>
</html>
