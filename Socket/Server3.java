package Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server3 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(7890);

        byte[] bytes = new byte[1024];
        //׼����������
        DatagramPacket dp = new DatagramPacket(bytes,1024); //�����������ݵ�

        ds.receive(dp); // ��������

        //�������ֽ�������
        String s = new String(bytes,0, dp.getLength());
        System.out.println("���յ��������ǣ�"+s);

        //����һ�����ݸ��ͻ���
        byte[] bs = "����".getBytes();
        DatagramPacket dp2 = new DatagramPacket(bs,bs.length, InetAddress.getByName("localhost"),9898);

        ds.send(dp2);
    }
}
