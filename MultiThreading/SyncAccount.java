package MultiThreading;

public class SyncAccount {

    private double balance;

    public SyncAccount(double balance) {
        this.balance = balance;
    }

    public void getMoney() { //һ�����뵽�÷�����˲������acc
        synchronized (this) {
            if (this.balance <= 0) {
                System.out.println("���޴��");
                return;  //��ȥ
            }
            System.out.println("��ҪȡǮ�ˣ�Ŀǰ��ʣ�£�" + this.balance);
            this.balance -= 1000;
            System.out.println("ȡ���ˣ���ʣ��" + this.balance);
        }
    }
}