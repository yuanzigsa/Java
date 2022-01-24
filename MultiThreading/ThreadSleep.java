package MultiThreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep extends Thread {
    @Override
    public void run(){
        //让子线程不停的显示当前系统时间
        while (true) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            Date d = new Date();
            System.out.println(sdf.format(d));
            try {
                Thread.sleep(1000); // 睡眠时间1000毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep mt = new ThreadSleep();
        mt.start();
    }
}
