package MultiThreading;

public class ThreadYieldTest {
    public static void main(String[] args) {
        ThreadYield mt1 = new ThreadYield("A�߳�");
        ThreadYield mt2 = new ThreadYield("B�߳�");

        mt1.start();
        mt2.start();
    }
}
