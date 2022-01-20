package RongQi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRongQi {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("jay","周杰伦");
        map.put("17354394275","李进元");
        map.put("820","骆非池");
        map.put("17354394275","李进元是帅比");

        System.out.println(map);

        Map tell = new TreeMap();
        tell.put(111,"周杰伦");
        tell.put(222,"坂井泉水");

        System.out.println(tell);
        System.out.println(tell.size());
        System.out.println(map.containsKey("jay"));
        System.out.println(map.containsValue("李进元"));
        System.out.println(tell.get(222));
    }
}
