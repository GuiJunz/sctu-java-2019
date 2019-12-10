

<%@ page import="edu.sctu.dao.VoteDao" %>
<%@ page import="edu.sctu.dao.VoteDaoImp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%

    String tno= request.getParameter("tno");
    VoteDao voteDao = new VoteDaoImp();
    voteDao.voteTeacher(tno);
    request.getRequestDispatcher("/vote/index1.jsp").forward(request,response);
%>

