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
                //�ж��Ƿ����key1����������ڣ�����һ���µĽ�ȥ
                if (!map.containsKey("key1")){
                    map.put("key1",new ArrayList<Integer>());
                }
                map.get("key1").add(n); //��������ӵ��б�
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
