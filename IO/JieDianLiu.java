package IO;

import java.io.File;
import java.io.FileInputStream;

public class JieDianLiu {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new File("IO/a.txt"));

//        int b = fis.read();
//        System.out.println((char)b);

        byte[] bs = new byte[1024];
        int len = fis.read(bs);

        System.out.println(new String(bs,0,len));

        byte[] bytes = new byte[1024];
        int len2 = 0;

        while ((len=fis.read(bytes))!=-1){
            String s = new String(bytes,0,len2);
            System.out.println(s);
        }
        fis.close();
    }
}
