package MultiThreading;

public class ThreadInterrupt extends Thread {
    @Override
    public void run(){
        System.out.println("我要睡觉了" );
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            System.out.println("为什么不让睡了，醒了");
        }
        System.out.println("工作");
    }
}
