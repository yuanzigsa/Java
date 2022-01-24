package IO;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            file.createNewFile(); //����һ���ļ�,�������ļ���
            System.out.println(file.getParentFile()); //��ȡ�ļ�·��
            file.delete(); //ɾ���ļ�
            System.out.println(file.exists()); //�鿴�ļ��Ƿ����
            System.out.println(file.isAbsolute()); //�ж��Ƿ��Ǿ���·��
            System.out.println(file.isDirectory()); //�鿴�ļ��Ƿ����ļ���
            System.out.println(file.isFile()); //�ж��Ƿ����ļ�

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
