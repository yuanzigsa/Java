package MultiThreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadVideoThread extends Thread {
    public static AtomicInteger i = new AtomicInteger();

    // ׼����װ��Ƶ�Ļ����������У�
    private BlockingDeque<Video> videoQueue;
    public ReadVideoThread(BlockingDeque<Video> videoQueue){
        this.videoQueue = videoQueue;
    }
    @Override
    public void run(){
        while (true){
            while (true){
                String name = "����ʦ"+i.incrementAndGet();
                Video v = new Video(name); //�൱��i++
                try {
                    videoQueue.put(v); //�������
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("������һ����Ƶ"+name);
            }
        }
    }
}
