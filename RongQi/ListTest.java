package RongQi;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("������");
        list.add("С����");
        list.add("��ʦ��");

        System.out.println(list);

        list.remove("С����");

        System.out.println(list);
        System.out.println("�б��д洢��"+list.size()+"������");

        for (int i =0; i < list.size(); i++){
            String s = (String) list.get(i); //����ת��
            System.out.println(list.get(i));
        }
    }
}
