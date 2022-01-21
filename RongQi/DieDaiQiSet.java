package RongQi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DieDaiQiSet {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("小峰峰", "李易峰");
        map.put("小六六", "六小临潼");
        map.put("小凡凡", "吴亦凡");
        map.put("小坤坤", "蔡徐坤");

        //方案一
        Set set = map.keySet();//拿到所有key
        Iterator it = set.iterator(); //拿到迭代器
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(map.get(key));
        }

        //方案二
        Set set2 = map.entrySet();// set里面装的是entry
        Iterator it2 = set2.iterator();

        while (it2.hasNext()){
            Map.Entry entry = (Map.Entry) it2.next();

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
