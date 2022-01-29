package Socket.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9898);
        List<Socket> socketList = new ArrayList<Socket>();
        while (true){
            Socket s = ss.accept();
            socketList.add(s);

            //Ϊÿһ���ͻ�������һ���̣߳����������߳��Ƿ�����Ϣ���ݽ���
            new ServerMsgThread(s, socketList).start();
        }
    }
}