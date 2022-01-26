package Socket;

import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",9898);

        //对于客户端而言，不停的接收和发送数据
        //启动的第一个线程负责接收数据
        ReceThread rt = new ReceThread(s);
        rt.start(); //启动线程

        //启动的第二个县城负责发送数据
        SendThread st = new SendThread(s);
        st.start();

    }
}
