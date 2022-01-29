package Socket.chat;

import Chat.SendThread;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.连接服务器
        Socket s = new Socket("localhost",9898);

        //2.不停的发送消息
        new SendMsgThread(s).start();
        //3.不停的接收消息
        new ReceMsgThread(s).start();
    }
}
