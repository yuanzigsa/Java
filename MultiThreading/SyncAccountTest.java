package MultiThreading;

public class SyncAccountTest {
    public static void main(String[] args) {
        //创建一个账户
        SyncAccount acc = new SyncAccount(1000);
        //创建一个ATM线程
        GetMoneyThread atm = new GetMoneyThread(acc);
        //创建一个柜台进程
        GetMoneyThread table = new GetMoneyThread(acc);

        //开始取钱
        atm.start();
        table.start();
    }
}
