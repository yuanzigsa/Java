package RongQi;

import java.util.HashMap;
import java.util.Map;

public class RongQiLianXi2 {
    public static void main(String[] args) {
        String str = "k:1,K1:2,K2:3,K3:4";

        String[] strs = str.split(",");

        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String s:strs){
            String[] ss =s.split(":");
            map.put(ss[0],Integer.parseInt(ss[1]));
        }
        System.out.println(map);
    }
}
