package Socket;

import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",9898);

        //���ڿͻ��˶��ԣ���ͣ�Ľ��պͷ�������
        //�����ĵ�һ���̸߳����������
        ReceThread rt = new ReceThread(s);
        rt.start(); //�����߳�

        //�����ĵڶ����سǸ���������
        SendThread st = new SendThread(s);
        st.start();

    }
}
