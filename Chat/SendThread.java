package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendThread extends Thread {

    private DatagramSocket ds;

    public SendThread(DatagramSocket ds){
        this.ds=ds;
    }
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                String str = sc.nextLine();
                byte[] bs = str.getBytes(); //转成字节数组
                DatagramPacket dp = new DatagramPacket(bs,bs.length, InetAddress.getByName("localhost"),10086);
                ds.send(dp);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
