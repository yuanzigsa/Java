package MultiThreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep extends Thread {
    @Override
    public void run(){
        //�����̲߳�ͣ����ʾ��ǰϵͳʱ��
        while (true) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            Date d = new Date();
            System.out.println(sdf.format(d));
            try {
                Thread.sleep(1000); // ˯��ʱ��1000����
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
