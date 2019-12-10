package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {

    }

    @Override
    public void saveUser(User user) {
        Connection connection = null;
        Statement statement = null;
        String sql="insert into t_users(username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&characterEncoding=UTF-8",
                    "root",
                    "980925"//写自己的名字
            );
            statement=connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e1){
            e1.printStackTrace();

        }
    }

    @Override
    public void deleteById(int id) {

        Connection connection = null;
        Statement statement = null;
        String sql="delete from t_users where id="+id+"";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&characterEncoding=UTF-8",
                    "root",
                    "123456"
            );
            statement=connection.createStatement();
            statement.executeUpdate(sql);
        }catch (SQLException e1){
            e1.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {


    }

    @Override
    public List<User> selectAll() {
        List<User> userList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_users";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&characterEncoding=UTF-8",
                    "root",
                    "123456"
            );

            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                User user = new User(id, username, password);
                userList.add(user);

//        System.out.println(id+username+password);
            }
        } catch (Exception e) {

        } finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userList;

    }


}



