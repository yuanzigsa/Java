package Socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9898);

        Socket s = ss.accept();

        //���������ԣ���ͣ�Ľ��պͷ�������
        //�����ĵ�һ���سǸ���������
        ReceThread rt = new ReceThread(s);
        rt.start(); //�����س�

        //�����ĵڶ����سǸ����������
        SendThread st = new SendThread(s);
        st.start();


    }
}
