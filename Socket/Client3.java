package Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client3 {
    public static void main(String[] args) throws Exception {
        //�ӿͻ��˷�������
        // 1.���Ա
        DatagramSocket ds = new DatagramSocket(9898);

        byte[] bs = "��ð�".getBytes();
        //2.���Ա
        DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getByName("localhost"), 7890);

        //3.�Ѱ������ͳ�ȥ
        ds.send(dp);

        //��������
        byte[] bytes = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(bytes,1024);

        ds.receive(dp2);

        String content = new String(bytes,0,dp2.getLength());
        System.out.println("�ͻ��˽��յ������ǣ�"+content);
    }
}
