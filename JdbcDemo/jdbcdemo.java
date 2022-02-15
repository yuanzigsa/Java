package JdbcDemo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接
        String url = "jdbc:mysql://127.0.0.1:3306/yuanzi?useSSL=false";
        String username = "root";
        String password = "lijinyuan";
        Connection conn = DriverManager.getConnection(url,username,password);

        //3.定义sql语句
        String sql = "update stu set math = 99 where id = 1";

        //4.获取执行sql对象statement
       Statement stmt = conn.createStatement();

       //5.执行sql
        int count = stmt.executeUpdate(sql); //受影响的行数

        //6.处理结果
        System.out.println(count);

        //7.释放资源
        stmt.close();
        conn.close();
    }
}
