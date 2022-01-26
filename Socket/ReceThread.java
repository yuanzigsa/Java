package Socket;

import IO.Buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceThread extends Thread {
    private Socket s;
    public ReceThread(Socket s){
        this.s = s;

    }
    @Override
    public void run(){
        //��ͣ�Ľ�������
        while (true){
            try {
                InputStream is = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String content = br.readLine();

                System.out.println("���յ��������ǣ�"+content);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
