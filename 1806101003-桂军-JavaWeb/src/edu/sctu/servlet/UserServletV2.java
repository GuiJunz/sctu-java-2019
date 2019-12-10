package edu.sctu.servlet;

import edu.sctu.dao.UserDao;
import edu.sctu.dao.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserServletV2 extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ebfufwbjredbfwoerr");

        UserDao userDao = null;
        try {
            userDao = new UserDaoImpl();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<User> userList = userDao.selectAll();

        req.setAttribute("userList",userList);
        //跳转
        req.getRequestDispatcher("test08.jsp").forward(req,resp);
    }
}
