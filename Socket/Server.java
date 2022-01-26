package Socket;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        //1. 创建服务器对象
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("服务器端启动成功，等待连接");
        //2.等待客户端连接
        Socket s = ss.accept(); //阻塞

        System.out.println("客户端连接成功！！！！");

        Scanner sc = new Scanner(System.in);

        while (true) {
            //3.服务器接收数据
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String content = br.readLine();
            System.out.println("从客户端接收到的数据是：" + content);

            //4.给客户端发送一条数据
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(sc.nextLine());

            bw.newLine();
            bw.flush();
        }

    }
}
