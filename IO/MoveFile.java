package IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MoveFile {
    public static void main(String[] args) throws Exception {
        File f = new File("Api/坂井泉水.jpeg");
        FileInputStream fis = new FileInputStream(new File("Api/坂井泉水.jpeg"));
        FileOutputStream fos = new FileOutputStream(new File("IO/坂井泉水2.jpeg"));

        byte[] bs = new byte[1024];

        int leng = 0;
        while((leng=fis.read(bs))!=-1){ //读取数据
            fos.write(bs,0,leng);  //写出数据
        }
        fis.close();
        fos.flush();
        fos.close();

        f.delete();
    }
}
