package IO;

import java.io.OutputStreamWriter;
import java.io.Writer;

public class ZhuanHuanLiu {
    public static void main(String[] args) throws Exception {
        Writer writer = new OutputStreamWriter(System.out);
        writer.write("��ã��ҽ��ܽ���");
        writer.flush();
//        writer.close();  ��ʱ���������Թص�

    }
}
