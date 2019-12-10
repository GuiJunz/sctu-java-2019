package edu.sctu.dao;

import edu.sctu.mode1.Teacher;

import java.util.List;

public interface VoteDao {
    void voteTeacher(String tno);//通过工号进行投票


    List<Teacher> selectAll();//查询

    Teacher findByTno(String tno);

}
