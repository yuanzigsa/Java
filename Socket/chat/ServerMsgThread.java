package Socket.chat;

import java.net.Socket;
import java.util.List;

public class ServerMsgThread extends Thread {
    private Socket s;
    private List<Socket> socketList;

    public ServerMsgThread(Socket s,List<Socket> socketList){
        this.s = s;
        this.socketList = socketList;
    }

    @Override
    public void run(){
        while (true) {
            //接收消息
            String msg = SocketUtil.rece(this.s);
            //把接收到的消息发送出去 ->socketList
            for (Socket s:socketList){
                if (s.equals(this.s)){
                    continue;
                }
                SocketUtil.send(s,msg);
            }
        }
    }
}
