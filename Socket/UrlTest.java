package Socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest {
    public static void main(String[] args) throws Exception {
        //1.创建url对象
        URL u = new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202006%2F19%2F20200619091723_udivf.thumb.1000_0.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1646051409&t=bfcb5e4d2b0f6f059f1b49fa4fe65474");

        //2.打开这个链接
        URLConnection uc = u.openConnection();

        //3.读取内容
        InputStream is = uc.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("Socket/坂井泉水.jpg"));
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.flush();
        fos.close();
        is.close();

        System.out.println("下载完毕");
    }
}
