package IO;

import java.io.*;
import java.text.DecimalFormat;

public class HomeWork {
    public static void main(String[] args) throws Exception {

        DecimalFormat df = new DecimalFormat(".00");

        //         1.�ܴ��ļ��ж�ȡˮ����Ϣ
        //         1.1������������BufferedReader

        File f1 = new File("IO/fruit.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));

        File f2 = new File("IO/����_fruit.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String title = br.readLine(); //��һ������
        bw.write(title+"_�ܼ�");
        bw.newLine();

//         2.����ˮ���ܼ۸�
//         2.1 ��ȡ����ˮ����Ϣ
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

//         3.�ļ����޸�-���ܼ۸�д��Դ�ļ���
        f1.delete();  //ɾ��Դ�ļ�
        f2.renameTo(f1); //������



    }
}
