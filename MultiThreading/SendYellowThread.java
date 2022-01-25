package MultiThreading;

import java.util.concurrent.BlockingDeque;

public class SendYellowThread extends Thread {
    private BlockingDeque<Video> videoQueue;
    public SendYellowThread(BlockingDeque<Video> videoQueue){
        this.videoQueue = videoQueue;
    }
    @Override
    public void run(){
        while (true){
            try {
                Video video = videoQueue.take();
                System.out.println("我是发送的地方，我发现了一个视频"+video.getName());
                Thread.sleep(150);  //让两个线程的执行效率不一样
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
