package Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
    private Socket s;
    public SendThread(Socket s){
        this.s = s;
    }

    @Override
    public  void run(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                OutputStream os  = s.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

                bw.write(sc.nextLine());
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
