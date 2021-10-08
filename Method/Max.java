package Method;

public class Max {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
