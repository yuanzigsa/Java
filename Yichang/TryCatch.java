package Yichang;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            // e.printStackTrace(); //打印错误信息
            System.out.println("系统出错了，请联系管理员");
        }finally {
            System.out.println("你好啊，我是finally");
        }
    }
}
