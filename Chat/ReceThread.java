package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceThread extends Thread{

    private DatagramSocket ds;

    public ReceThread(DatagramSocket ds) {
        this.ds = ds;
    }
    @Override
    public void run(){
        while (true) {
            try {
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, 1024);
                ds.receive(dp);
                System.out.println(new String(bytes, 0, dp.getLength()));

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
