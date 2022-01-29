package Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client3 {
    public static void main(String[] args) throws Exception {
        //从客户端发送数据
        // 1.快递员
        DatagramSocket ds = new DatagramSocket(9898);

        byte[] bs = "你好啊".getBytes();
        //2.快递员
        DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getByName("localhost"), 7890);

        //3.把包裹发送出去
        ds.send(dp);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(bytes,1024);

        ds.receive(dp2);

        String content = new String(bytes,0,dp2.getLength());
        System.out.println("客户端接收的数据是："+content);
    }
}
