package RongQi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DieDaiQiSet {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("С���", "���׷�");
        map.put("С����", "��С����");
        map.put("С����", "���ෲ");
        map.put("С����", "������");

        //����һ
        Set set = map.keySet();//�õ�����key
        Iterator it = set.iterator(); //�õ�������
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(map.get(key));
        }

        //������
        Set set2 = map.entrySet();// set����װ����entry
        Iterator it2 = set2.iterator();

        while (it2.hasNext()){
            Map.Entry entry = (Map.Entry) it2.next();

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
