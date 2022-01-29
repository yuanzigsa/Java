package Socket.chat;

import Chat.SendThread;

import java.net.Socket;
import java.util.Scanner;

public class SendMsgThread extends Thread {

    private Socket s;
    public SendMsgThread(Socket s){
        this.s = s;
    }
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        while (true){
            //考虑吧发送消息的功能单独的提取出来
            String content = sc.nextLine();
            SocketUtil.send(s,content);
        }
    }
}
