package IO;

import java.io.*;
import java.text.DecimalFormat;

public class HomeWork {
    public static void main(String[] args) throws Exception {

        DecimalFormat df = new DecimalFormat(".00");

        //         1.能从文件中读取水果信息
        //         1.1创建输入流，BufferedReader

        File f1 = new File("IO/fruit.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));

        File f2 = new File("IO/副本_fruit.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String title = br.readLine(); //第一行内容
        bw.write(title+"_总价");
        bw.newLine();

//         2.计算水果总价格
//         2.1 读取所有水果信息
        String content = "";
        while ((content = br.readLine())!=null){
            String[] fs = content.split("_");

            double price = Double.parseDouble(fs[1]);
            double num = Double.parseDouble(fs[2]);
            double totle = price * num;
            String totleStr = df.format(totle);

            content += "_"+totleStr;
            bw.write(content);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();

//         3.文件的修改-把总价格写回源文件里
        f1.delete();  //删除源文件
        f2.renameTo(f1); //重命名



    }
}
