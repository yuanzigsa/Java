package Api;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CeShouSu {
    public static void main(String[] args) {
        System.out.println("��Ϸ���Ͽ�ʼ��������׼��");
        Scanner sc =  new Scanner(System.in);
        sc.nextLine();  //�ó���ͣ������

        //��Ϸ��ʼ
        //׼��һ����Ϸ������ʱ��
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.SECOND,cal.get(Calendar.SECOND)+5);
        Date end =cal.getTime();  //����ʱ��

        long endlong = end.getTime(); //����ʱ���ʱ�����long��

        int count = 0;
        while (endlong - new Date().getTime() >= 0){
            sc.nextLine(); //��һ�£��ȴ���������
            System.out.println("�㰴��");
            count++;
        }

         //����һ�����˶��ٴ�
        System.out.println("����20��֮ǰ��һ������"+count+"��");

        double pin = count/5.0;

        //��Ƶ�ʽ��и�ʽ��
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("���������ǣ�"+df.format(pin)+"��/��");
    }

}


