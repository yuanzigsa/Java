package Api;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear()+1900);
        System.out.println(d.getMonth()+1);
        System.out.println(d.getDate());
        System.out.println(d.getHours());

        System.out.println(d.getTime());
    }
}
