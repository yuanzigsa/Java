package MultiThreading;

public class ThreadYieldTest {
    public static void main(String[] args) {
        ThreadYield mt1 = new ThreadYield("A线程");
        ThreadYield mt2 = new ThreadYield("B线程");

        mt1.start();
        mt2.start();
    }
}
