package OOP.OopExp1;

public class MysqlDao extends AbstractDao {
    @Override
    public void connect() {
        System.out.println("MySQL数据库连接中......");
    }
}
