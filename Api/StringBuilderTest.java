package Api;

import java.lang.ref.SoftReference;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("�δ���");
        System.out.println(sb2);
        sb2.append("�����Ԫ");
        System.out.println(sb2);
        sb2.insert(3,"������");
        System.out.println(sb2);
        sb2.append(123);
        System.out.println(sb2);

        String s = sb2.toString();
        System.out.println(s);

    }
}
