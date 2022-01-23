package IO;

import java.io.*;

public class Buffer {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("IO/a.txt")));
        BufferedReader br = new BufferedReader(new FileReader(new File("IO/a.txt")));
        System.out.println(br.readLine()); //��ȡ�ļ�����õķ���
        System.out.println(br.readLine());

        String str = "";
        while ((str=br.readLine())!=null){  //��ȡ����
            System.out.println(str);
        }
        br.close();
    }
}
