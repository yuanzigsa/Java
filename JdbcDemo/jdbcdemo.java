package JdbcDemo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) throws Exception {
        //1.ע������
        Class.forName("com.mysql.jdbc.Driver");

        //2.��ȡ����
        String url = "jdbc:mysql://127.0.0.1:3306/yuanzi?useSSL=false";
        String username = "root";
        String password = "lijinyuan";
        Connection conn = DriverManager.getConnection(url,username,password);

        //3.����sql���
        String sql = "update stu set math = 99 where id = 1";

        //4.��ȡִ��sql����statement
       Statement stmt = conn.createStatement();

       //5.ִ��sql
        int count = stmt.executeUpdate(sql); //��Ӱ�������

        //6.������
        System.out.println(count);

        //7.�ͷ���Դ
        stmt.close();
        conn.close();
    }
}
