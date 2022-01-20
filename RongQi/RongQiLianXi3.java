package RongQi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RongQiLianXi3 {
    public static void main(String[] args) {
        int[] li = {11,22,33,44,55,66,77,88,99,00};

        Map<String, List<Integer>> map = new HashMap<String,List<Integer>>();

        for (int n:li){
            if (n >= 66){
                //判断是否存在key1，如果不存在，创建一个新的进去
                if (!map.containsKey("key1")){
                    map.put("key1",new ArrayList<Integer>());
                }
                map.get("key1").add(n); //把数据添加到列表
            }else {
                if (!map.containsKey("key2")){
                    map.put("key2",new ArrayList<Integer>());
                }
                map.get("key2").add(n);
            }
        }
        System.out.println(map);
    }
}
