package Api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShiJianCha {
    public static void main(String[] args) throws ParseException {
        String s1 = "2022-1-18 20:00:00";
        String s2 = "2022-1-18 22:45:00";
        //格式化时间的工具
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将字符串转化成时间
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);
        //转化成long类的时间
        long long1 = d1.getTime();
        long long2 = d2.getTime();

        long diff = Math.abs(long1 - long2); //计算毫秒级别时间差并求绝对值

        //毫秒级别的时间差
        long diffsec = diff/1000;

        //分钟级别时间差
        long diffMin =diffsec/60;

        long diffHourDisplay = diffMin/60;
        long diffMinDisplay = diffMin%60;

        System.out.println("您一共玩了"+diffMin+"小时"+diffMinDisplay+"分钟");

    }
}
