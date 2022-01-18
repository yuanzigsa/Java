package Api;

import java.lang.ref.SoftReference;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("宋大义");
        System.out.println(sb2);
        sb2.append("和李大元");
        System.out.println(sb2);
        sb2.insert(3,"哈哈哈");
        System.out.println(sb2);
        sb2.append(123);
        System.out.println(sb2);

        String s = sb2.toString();
        System.out.println(s);

    }
}
