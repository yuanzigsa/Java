package Socket;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        //1. ��������������
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("�������������ɹ����ȴ�����");
        //2.�ȴ��ͻ�������
        Socket s = ss.accept(); //����

        System.out.println("�ͻ������ӳɹ���������");

        Scanner sc = new Scanner(System.in);

        while (true) {
            //3.��������������
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String content = br.readLine();
            System.out.println("�ӿͻ��˽��յ��������ǣ�" + content);

            //4.���ͻ��˷���һ������
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(sc.nextLine());

            bw.newLine();
            bw.flush();
        }

    }
}
