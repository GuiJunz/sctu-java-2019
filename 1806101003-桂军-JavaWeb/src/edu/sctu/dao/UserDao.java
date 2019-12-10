package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    void saveUser(User user);


    void deleteByid(int id);


    void updataUser(User user);


    List<User> selectAll();
}
