package RongQi;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("福满多");
        list.add("小当家");
        list.add("康师傅");

        System.out.println(list);

        list.remove("小当家");

        System.out.println(list);
        System.out.println("列表中存储了"+list.size()+"个数据");

        for (int i =0; i < list.size(); i++){
            String s = (String) list.get(i); //向下转型
            System.out.println(list.get(i));
        }
    }
}
