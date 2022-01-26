package Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象，链接服务器
        Socket socket = new Socket("localhost",9999);
        System.out.println("客户端连接服务器成功！！！！");
        Scanner sc = new Scanner(System.in);

        while (true) {

            //2.从客户端发送数据给服务器
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(sc.nextLine());

            bw.flush();   //不可以省略，否则容易接受不到数据
//        bw.close();  // 不可以关闭这个流
            bw.newLine();  //为了保证对方用readline接收的时候，能收到数据

            bw.flush();    // 不可以省略，否则容易接受不到数据
//        bw.close();  //不可以关闭这个流

            //3.客户端接收数据
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String content = br.readLine();
            System.out.println("从服务器接收到的数据是" + content);
        }

    }
}