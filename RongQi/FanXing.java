package RongQi;

import javax.swing.*;
import java.util.*;

public class FanXing {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();

        strList.add("蔡徐坤坤"); //不可以装int
        strList.add("吴亦凡凡");
        strList.add("李易峰峰");

        String s = strList.get(1);
        System.out.println(s);

        List<FanXingSinger> list2 = new ArrayList<FanXingSinger>();

        list2.add(new FanXingSinger(1,"蔡徐坤",2.25,"只因你太美"));
        list2.add(new FanXingSinger(2,"吴亦凡",2.11,"不知道"));
        list2.add(new FanXingSinger(3,"李易峰",1.11,"也不知道"));
        list2.add(new FanXingSinger(4,"鹿晗",2.11,"还是不知道"));

        Iterator<FanXingSinger> it = list2.iterator();
        while (it.hasNext()){
            FanXingSinger s2 = it.next();
            System.out.println(s2.getName());
            System.out.println(s2.getSong());
        }

        Map<String,String> map = new HashMap<String,String>();

        map.put("老坛酸菜","我的最爱");
        map.put("红烧牛肉","吃吐了");
        map.put("藤椒面","一般般");

        String s3 = map.get("老坛酸菜");
        System.out.println(s3);
    }
}
