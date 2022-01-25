package MultiThreading;

public class ThreadInteruptTest {
    public static void main(String[] args) {
        ThreadInterrupt mt = new ThreadInterrupt();
        mt.start();

        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }

        mt.interrupt();  //打断正在睡眠中的子线程
    }
}
