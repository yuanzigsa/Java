package IO;

import java.io.*;

public class WenJianXiuGai {
    public static void main(String[] args) throws Exception {

        File res = new File("IO/唐诗三首.txt");
        File another = new File("IO/副本唐诗三首.txt");
        BufferedReader br = new BufferedReader(new FileReader(res));
        BufferedWriter bw = new BufferedWriter(new FileWriter(another));

        String line = "";
        while ((line = br.readLine())!=null){
            line = line.replace("李白","李太白");
            bw.write(line);
            bw.newLine();  //另起一行
        }

        br.close();
        bw.flush();
        bw.close();

        // 删除源文件
        res.delete();//删除文件
        another.renameTo(res); //重命名文件

    }
}
