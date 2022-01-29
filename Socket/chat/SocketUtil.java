package Socket.chat;

import java.io.*;
import java.net.Socket;

/*
工具类
负责发送和接收消息
 */
public class SocketUtil {
    //1.发送消息
    //静态的内容可以直接用类名访问，调用的时候不用new对象了、
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
    //2.接收信息
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
