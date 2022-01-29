package Socket.chat;

import Chat.SendThread;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.���ӷ�����
        Socket s = new Socket("localhost",9898);

        //2.��ͣ�ķ�����Ϣ
        new SendMsgThread(s).start();
        //3.��ͣ�Ľ�����Ϣ
        new ReceMsgThread(s).start();
    }
}
