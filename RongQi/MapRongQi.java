package RongQi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRongQi {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("jay","�ܽ���");
        map.put("17354394275","���Ԫ");
        map.put("820","��ǳ�");
        map.put("17354394275","���Ԫ��˧��");

        System.out.println(map);

        Map tell = new TreeMap();
        tell.put(111,"�ܽ���");
        tell.put(222,"�ྮȪˮ");

        System.out.println(tell);
        System.out.println(tell.size());
        System.out.println(map.containsKey("jay"));
        System.out.println(map.containsValue("���Ԫ"));
        System.out.println(tell.get(222));
    }
}
