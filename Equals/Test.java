package Equals;

public class Test {
    public static void main(String[] args) {
        String str1 = "С��";
        String str2 = "С��"; //�ڶ��ε�С�첢û�е���ռ���ڴ�ռ�
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
