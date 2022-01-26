package Socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9898);

        Socket s = ss.accept();

        //服务器而言，不停的接收和发送数据
        //启动的第一个县城负责发送数据
        ReceThread rt = new ReceThread(s);
        rt.start(); //启动县城

        //启动的第二个县城负责接收数据
        SendThread st = new SendThread(s);
        st.start();


    }
}
