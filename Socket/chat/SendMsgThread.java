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
            //���ǰɷ�����Ϣ�Ĺ��ܵ�������ȡ����
            String content = sc.nextLine();
            SocketUtil.send(s,content);
        }
    }
}
