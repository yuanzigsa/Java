package JdbcDemo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) throws Exception {
        //1.ע������
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.��ȡ����
        String url = "jdbc:mysql://127.0.0.1:3306/cmdb?useSSL=false";
        String username = "root";
        String password = "demo888";
        Connection conn = DriverManager.getConnection(url,username,password);

        //3.����sql���
            String sql = "select * from asset_custome";

        //4.��ȡִ��sql����statement
           Statement stmt = conn.createStatement();

           //5.ִ��sql
            ResultSet set = stmt.executeQuery(sql);

            //6.������
        while (set.next()) {
            System.out.println(set.getString(4));
        }
        //7.�ͷ���Դ
        stmt.close();
        conn.close();
    }
}
