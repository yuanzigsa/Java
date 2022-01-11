package Equals;

public class Test {
    public static void main(String[] args) {
        String str1 = "小红";
        String str2 = "小红"; //第二次的小红并没有单独占用内存空间
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
