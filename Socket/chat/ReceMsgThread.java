package Socket.chat;

import java.net.Socket;

public class ReceMsgThread extends Thread {
    private Socket s;

    public ReceMsgThread(Socket s){
        this.s = s;
    }

    @Override
    public void run(){
        while (true){
            String msg = SocketUtil.rece(s);
            System.out.println(msg);
        }
    }
}
