package Api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShiJianCha {
    public static void main(String[] args) throws ParseException {
        String s1 = "2022-1-18 20:00:00";
        String s2 = "2022-1-18 22:45:00";
        //��ʽ��ʱ��Ĺ���
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //���ַ���ת����ʱ��
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);
        //ת����long���ʱ��
        long long1 = d1.getTime();
        long long2 = d2.getTime();

        long diff = Math.abs(long1 - long2); //������뼶��ʱ�������ֵ

        //���뼶���ʱ���
        long diffsec = diff/1000;

        //���Ӽ���ʱ���
        long diffMin =diffsec/60;

        long diffHourDisplay = diffMin/60;
        long diffMinDisplay = diffMin%60;

        System.out.println("��һ������"+diffMin+"Сʱ"+diffMinDisplay+"����");

    }
}
