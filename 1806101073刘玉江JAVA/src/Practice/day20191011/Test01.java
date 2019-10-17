package src.Practice.day20191011;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1查询
        String sql = "select * from t_users";
        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写你自己的账号和密码
            );
            //2.statement
            statement = connection.createStatement();
            //3.resultSet
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id =resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                System.out.println(id + " - " + username + " - " + password);

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
    }
}
