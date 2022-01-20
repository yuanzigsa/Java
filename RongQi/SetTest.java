package RongQi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set s = new HashSet();

        s.add("DOTA2");
        s.add("GTA5");
        s.add("TURBO");
        s.add("DOTA2");

        System.out.println(s);

        Set d = new TreeSet();

        d.add(231);
        d.add(322);
        d.add(23);

        System.out.println(d);

        d.remove(322);
        System.out.println(d);

    }
}
