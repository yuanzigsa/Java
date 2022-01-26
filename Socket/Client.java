package Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.����Socket�������ӷ�����
        Socket socket = new Socket("localhost",9999);
        System.out.println("�ͻ������ӷ������ɹ���������");
        Scanner sc = new Scanner(System.in);

        while (true) {

            //2.�ӿͻ��˷������ݸ�������
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write(sc.nextLine());

            bw.flush();   //������ʡ�ԣ��������׽��ܲ�������
//        bw.close();  // �����Թر������
            bw.newLine();  //Ϊ�˱�֤�Է���readline���յ�ʱ�����յ�����

            bw.flush();    // ������ʡ�ԣ��������׽��ܲ�������
//        bw.close();  //�����Թر������

            //3.�ͻ��˽�������
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String content = br.readLine();
            System.out.println("�ӷ��������յ���������" + content);
        }

    }
}