package Method;

public class FangFaChongZai {
    public static void add(int a,int b){
        System.out.println("这是int");
        System.out.println(a+b);
    }
    public static void add(double a,double b){
        System.out.println("这是double");
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(1,2);
    }
}
