package MultiThreading;

public class MyRunable implements Runnable {
    @Override
    public void run(){
        for (int i =0;i<1000;i++){
            System.out.println("�������߳�"+i);
        }
    }
}
