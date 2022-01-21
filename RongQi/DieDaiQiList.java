package RongQi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DieDaiQiList {
    public static void main(String[] args) {
        List list =  new ArrayList();
        
        list.add("²ÌĞìÀ¤");
        list.add("ÎâÒà·²");
        list.add("ÀîÒ×·å");
        list.add("Â¹êÏ");

        Iterator it = list.iterator();

//        String s0 = (String) it.next();
//        System.out.println(s0);
//
//        String s1 = (String) it.next();
//        System.out.println(s1);
//
//        String s2 = (String) it.next();
//        System.out.println(s2);
        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
