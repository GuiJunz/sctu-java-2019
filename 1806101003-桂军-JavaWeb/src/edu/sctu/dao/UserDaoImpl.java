package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String sql =  null;

    public UserDaoImpl() throws ClassNotFoundException, SQLException {
        //3+1的连接操作
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                "root",
                "971214"); //写你自己的账号和密码

        statement = connection.createStatement();
        /*statement.executeUpdate(sql);*/
    }


    @Override
    public void saveUser(User user) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "insert into  t_users(username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "971214"); //写你自己的账号和密码

            statement = connection.createStatement();
            statement.executeUpdate(sql);


        }catch (Exception e){

        }finally {


        }


    }

    @Override
    public void deleteByid(int id) {
        Connection connection = null;
        Statement statement = null;

        String sql = "delete from t_users where id = "+id+"";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "971214"); //写你自己的账号和密码

            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){

        }finally {

        }

    }

    @Override
    public void updataUser(User user) {

    }

    @Override
    public List<User> selectAll() {
        List<User> userList = new ArrayList<>();
        //1、从数据库读取所有用户数据   3+1
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_users";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "971214"); //写你自己的账号和密码
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getNString("password");
                User user = new User(id, username, password);

                /*System.out.println(id+"-"+username+"-" +password);*/

                userList.add(user);
            }
        }catch (Exception e){

        }finally {
        }

        return userList;
    }
}

