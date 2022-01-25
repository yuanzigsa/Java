package MultiThreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadVideoThread extends Thread {
    public static AtomicInteger i = new AtomicInteger();

    // 准备能装视频的缓冲区（队列）
    private BlockingDeque<Video> videoQueue;
    public ReadVideoThread(BlockingDeque<Video> videoQueue){
        this.videoQueue = videoQueue;
    }
    @Override
    public void run(){
        while (true){
            while (true){
                String name = "苍老师"+i.incrementAndGet();
                Video v = new Video(name); //相当于i++
                try {
                    videoQueue.put(v); //添加数据
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("发现了一个视频"+name);
            }
        }
    }
}
