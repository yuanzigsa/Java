package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client extends Thread {
    public static void main(String[] args) throws Exception {
        System.out.println("������һ���˿ں�");
        Scanner sc = new Scanner(System.in);

        int port = Integer.parseInt(sc.nextLine());

        DatagramSocket ds = new DatagramSocket(port);

        byte[] bs = "����һ��������ң���Ҵ��к��ɣ�".getBytes(); //ת���ֽ�����
        DatagramPacket dp = new DatagramPacket(bs,bs.length, InetAddress.getByName("localhost"),10086);
        ds.send(dp);

        new SendThread(ds).start();
        new ReceThread(ds).start();
    }
}
