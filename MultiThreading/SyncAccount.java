package MultiThreading;

public class SyncAccount {

    private double balance;

    public SyncAccount(double balance) {
        this.balance = balance;
    }

    public void getMoney() { //一旦进入到该方法，瞬间锁定acc
        synchronized (this) {
            if (this.balance <= 0) {
                System.out.println("暂无存款");
                return;  //回去
            }
            System.out.println("我要取钱了，目前还剩下：" + this.balance);
            this.balance -= 1000;
            System.out.println("取完了，还剩：" + this.balance);
        }
    }
}