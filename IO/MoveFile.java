package IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MoveFile {
    public static void main(String[] args) throws Exception {
        File f = new File("Api/�ྮȪˮ.jpeg");
        FileInputStream fis = new FileInputStream(new File("Api/�ྮȪˮ.jpeg"));
        FileOutputStream fos = new FileOutputStream(new File("IO/�ྮȪˮ2.jpeg"));

        byte[] bs = new byte[1024];

        int leng = 0;
        while((leng=fis.read(bs))!=-1){ //��ȡ����
            fos.write(bs,0,leng);  //д������
        }
        fis.close();
        fos.flush();
        fos.close();

        f.delete();
    }
}
