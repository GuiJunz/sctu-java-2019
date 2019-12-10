package edu.sctu.listener;

import edu.sctu.dao.UserDao;
import edu.sctu.dao.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;
import java.util.List;

public class DemoListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //当网站初始化成功后
        System.out.println(">>>>>>>>>>>网站初始化成功了>>>>>>>>>>");




    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //当网站关闭后
        System.out.println(">>>>>>>>>>>网站关闭了>>>>>>>>>>");
    }
}
