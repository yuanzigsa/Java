package JdbcDemo;
import java.io.PrintWriter;
import java.sql.*;

public class jabcInert {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/cmdb?useSSL=false";
        String username = "root";
        String password = "demo888";
        Connection cono = DriverManager.getConnection(url,username,password);
        Statement stmt = cono.createStatement();

        String sql = "insert into asset_downip values(5,'192.168.1.1','rew','323','ggggggg')";
        int i = stmt.executeUpdate(sql);

        System.out.println("生效了"+i+"行");

        cono.close();
        stmt.close();
    }
}
