package edu.sctu.dao;

import edu.sctu.mode1.Teacher;
import edu.sctu.utils.DatabaseManger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VoteDaoImp implements VoteDao{
    private DatabaseManger databaseManger = new DatabaseManger();

    @Override
    public void voteTeacher(String tno) {
        //先根据工号查到这个老师
        Teacher teacher = findByTno(tno);
        teacher.setVoteNum(teacher.getVoteNum()+1);

        String sql = "update t_vote set voteNum ="+teacher.getVoteNum()+"where tno ='"+tno+"'";

        Statement statement = databaseManger.open();
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Teacher> selectAll() {
        Statement statement = databaseManger.open();
        String sql = "select * from t_vote";

        List<Teacher> teacherList = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String tno = resultSet.getString(2);
                String realName = resultSet.getString(3);
                int voteNum = resultSet.getInt(4);
                /*System.out.println(id);*/
                Teacher teacher = new Teacher();
                teacher.setVoteNum(voteNum);
                teacher.setRealName(realName);
                teacher.setTno(tno);
                teacherList.add(teacher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teacherList;
    }
    @Override
    public Teacher findByTno(String tno) {
        String sql = "select * from t_vote where tno="+tno;

        Statement statement = databaseManger.open();
        Teacher teacher = new Teacher();

        try{
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            teacher.setTno(resultSet.getString(2));
            teacher.setRealName(resultSet.getString(3));
            teacher.setVoteNum(resultSet.getInt(4));



        }catch (Exception e){
            e.printStackTrace();
        }
        return teacher;
    }


}
