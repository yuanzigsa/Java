package MultiThreading;

public class GetMoneyThread extends Thread {
    private SyncAccount acc;
    public GetMoneyThread(SyncAccount acc){
        this.acc = acc;
    }
    @Override
    public void run(){
        acc.getMoney();
    }
}
