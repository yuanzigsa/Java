package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(10086);

        //�ͻ����б�
        //����ÿһ��map���ǿͻ���
        //ip,port

        List<HashMap<String, String>> clientlist = new ArrayList<>();

        while (true) {
            //1.��������
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, 1024);
            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            String port = dp.getPort() + "";

            boolean flag = true;
            //2.�жϿͻ����Ƿ���������
            for (HashMap<String, String> map : clientlist) {
                if (map.get("ip").equals(ip) && map.get("port").equals(port)) {
                    //����������
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                HashMap<String, String> map = new HashMap<>();
                map.put("ip", ip);
                map.put("port", port);
                clientlist.add(map);
            }

            for (HashMap<String, String> map : clientlist) {
                if (map.get("ip").equals(ip) && map.get("port").equals(port)) {
                    continue;
                } else {
                    DatagramPacket dp2 = new DatagramPacket(bytes, 0, dp.getLength(), InetAddress.getByName(map.get("ip")), Integer.parseInt(map.get("port")));
                    ds.send((dp2));
                }
            }
        }
    }

}