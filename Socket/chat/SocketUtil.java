package Socket.chat;

import java.io.*;
import java.net.Socket;

/*
������
�����ͺͽ�����Ϣ
 */
public class SocketUtil {
    //1.������Ϣ
    //��̬�����ݿ���ֱ�����������ʣ����õ�ʱ����new�����ˡ�
    public static void send(Socket s, String msg){
        try {
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(msg);
            bw.newLine();
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //2.������Ϣ
    public static String rece(Socket s){
        try {
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg = br.readLine();
            return msg;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
