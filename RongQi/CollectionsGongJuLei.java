package RongQi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsGongJuLei {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(123);
        lst.add(456);
        lst.add(789);
        lst.add(999);

        Integer min = Collections.min(lst);
        System.out.println(min);

        Integer max = Collections.max(lst);
        System.out.println(max);

        Collections.sort(lst); //对列表进行排序
        System.out.println(lst);

        Collections.shuffle(lst); //打乱一个列表
        System.out.println(lst);

        Collections.addAll(lst,555,324,655);
        System.out.println(lst);

    }
}
