package Api;

import java.util.Calendar;
import java.util.Date;

public class TestClendar {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal);
        Date d = new Date();
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DATE,cal.get(Calendar.DATE)-230);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));




    }
}
