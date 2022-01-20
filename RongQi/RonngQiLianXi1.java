package RongQi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RonngQiLianXi1 {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("武滕兰");
        li.add("波多野结衣");
        li.add("深田咏美");
        li.add("HongKongDoll");
        li.add("草你妈了个逼");

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的评论内容");
        String content = sc.nextLine();

        for(int i = 0; i < li.size(); i++ ){
            String ci = (String) li.get(i);
            if (content.contains(ci)){

                //拼接*
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
