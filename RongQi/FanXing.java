package RongQi;

import javax.swing.*;
import java.util.*;

public class FanXing {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();

        strList.add("��������"); //������װint
        strList.add("���ෲ��");
        strList.add("���׷��");

        String s = strList.get(1);
        System.out.println(s);

        List<FanXingSinger> list2 = new ArrayList<FanXingSinger>();

        list2.add(new FanXingSinger(1,"������",2.25,"ֻ����̫��"));
        list2.add(new FanXingSinger(2,"���ෲ",2.11,"��֪��"));
        list2.add(new FanXingSinger(3,"���׷�",1.11,"Ҳ��֪��"));
        list2.add(new FanXingSinger(4,"¹��",2.11,"���ǲ�֪��"));

        Iterator<FanXingSinger> it = list2.iterator();
        while (it.hasNext()){
            FanXingSinger s2 = it.next();
            System.out.println(s2.getName());
            System.out.println(s2.getSong());
        }

        Map<String,String> map = new HashMap<String,String>();

        map.put("��̳���","�ҵ��");
        map.put("����ţ��","������");
        map.put("�ٽ���","һ���");

        String s3 = map.get("��̳���");
        System.out.println(s3);
    }
}
