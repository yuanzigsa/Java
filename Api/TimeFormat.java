package Api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

    }
}
