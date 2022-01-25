package MultiThreading;

import java.nio.file.SecureDirectoryStream;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class VideoTest {
    public static void main(String[] args) {
        BlockingDeque<Video> videos = new LinkedBlockingDeque<Video>();
        //创建3个读取视频的线程
        ReadVideoThread rvt1 = new ReadVideoThread(videos);
        ReadVideoThread rvt2 = new ReadVideoThread(videos);
        ReadVideoThread rvt3 = new ReadVideoThread(videos);

        //创建2个发送视频的
        SendYellowThread syt1 = new SendYellowThread(videos);
        SendYellowThread syt2 = new SendYellowThread(videos);

        //让5个线程启动
        rvt1.start();
        rvt2.start();
        rvt3.start();

        syt1.start();
        syt2.start();
    }
}
