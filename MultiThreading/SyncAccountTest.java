package MultiThreading;

public class SyncAccountTest {
    public static void main(String[] args) {
        //����һ���˻�
        SyncAccount acc = new SyncAccount(1000);
        //����һ��ATM�߳�
        GetMoneyThread atm = new GetMoneyThread(acc);
        //����һ����̨����
        GetMoneyThread table = new GetMoneyThread(acc);

        //��ʼȡǮ
        atm.start();
        table.start();
    }
}
