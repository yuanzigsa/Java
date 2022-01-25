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
                System.out.println("���Ƿ��͵ĵط����ҷ�����һ����Ƶ"+video.getName());
                Thread.sleep(150);  //�������̵߳�ִ��Ч�ʲ�һ��
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
