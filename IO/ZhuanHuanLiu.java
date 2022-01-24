package IO;

import java.io.OutputStreamWriter;
import java.io.Writer;

public class ZhuanHuanLiu {
    public static void main(String[] args) throws Exception {
        Writer writer = new OutputStreamWriter(System.out);
        writer.write("你好，我叫周杰伦");
        writer.flush();
//        writer.close();  有时候流不可以关掉

    }
}
