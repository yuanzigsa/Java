package RongQi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RonngQiLianXi1 {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("������");
        li.add("����Ұ����");
        li.add("����ӽ��");
        li.add("HongKongDoll");
        li.add("�������˸���");

        Scanner sc = new Scanner(System.in);

        System.out.println("������������������");
        String content = sc.nextLine();

        for(int i = 0; i < li.size(); i++ ){
            String ci = (String) li.get(i);
            if (content.contains(ci)){

                //ƴ��*
                String s = "";
                for (int j = 0; j < ci.length();j++){
                    s+="*";
                }
                content = content.replace(ci,s);
            }
        }
        System.out.println(content);
    }
}
