package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client extends Thread {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入一个端口号");
        Scanner sc = new Scanner(System.in);

        int port = Integer.parseInt(sc.nextLine());

        DatagramSocket ds = new DatagramSocket(port);

        byte[] bs = "来了一个新人玩家，大家打招呼吧！".getBytes(); //转成字节数组
        DatagramPacket dp = new DatagramPacket(bs,bs.length, InetAddress.getByName("localhost"),10086);
        ds.send(dp);

        new SendThread(ds).start();
        new ReceThread(ds).start();
    }
}
