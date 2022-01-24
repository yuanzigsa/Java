package MultiThreading;

public class MyThread extends Thread {
    @Override
    public void run(){
        //要把子线程执行的内容写在run里
        for (int i = 0;i<1000;i++){
            System.out.println("这是子线程"+i);
        }
    }
}
