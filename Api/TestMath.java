package Api;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-12));
//        System.out.println(Math.abs(12));
//
//        System.out.println(Math.max(100,599));
//        System.out.println(Math.min(498,6));
//
//        System.out.println(Math.pow(3,3));//�����
//
//        System.out.println(Math.round(4.7));
//
//        System.out.println(Math.sqrt(9));
        System.out.println("����һԪ���η��̵Ľ�");
        Scanner sc = new Scanner(System.in);

        System.out.println("������a��");
        double a = sc.nextInt();

        System.out.println("������b��");
        double b =sc.nextInt();

        System.out.println("������c��");
        double c = sc.nextInt();

        double dt = Math.pow(b,2) - 4*a*c;
        if (dt <0 ){
            System.out.println("�޽�");
        }else if(dt == 0){
            System.out.println("�˷�����һ����");
            double x = (-b) / (2*a);
            System.out.println("��x="+x);
        }else{
            System.out.println("�˷�����������");
            double x1 = (-b+Math.sqrt(dt))/(2*a);
            double x2 = (-b-Math.sqrt(dt))/(2*a);

        }

    }
}
