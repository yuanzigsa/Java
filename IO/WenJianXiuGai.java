package IO;

import java.io.*;

public class WenJianXiuGai {
    public static void main(String[] args) throws Exception {

        File res = new File("IO/��ʫ����.txt");
        File another = new File("IO/������ʫ����.txt");
        BufferedReader br = new BufferedReader(new FileReader(res));
        BufferedWriter bw = new BufferedWriter(new FileWriter(another));

        String line = "";
        while ((line = br.readLine())!=null){
            line = line.replace("���","��̫��");
            bw.write(line);
            bw.newLine();  //����һ��
        }

        br.close();
        bw.flush();
        bw.close();

        // ɾ��Դ�ļ�
        res.delete();//ɾ���ļ�
        another.renameTo(res); //�������ļ�

    }
}
