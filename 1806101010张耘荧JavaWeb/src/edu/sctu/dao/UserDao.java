package edu.sctu.dao;

import edu.sctu.model.User;

import java.util.List;

public interface UserDao {

    //���ݿ���ܶ���
    //database access object
    //����
    void saveUser(User user);

    //ɾ��
    void deleteById(int id);

    //�޸�
    void updateUser(User user);

    //��ѯ����
    List<User> selectAll();


}
