package MultiThreading;

public class ThreadJoinTest {
    public static void main(String[] args) {
        ThreadJoin mt = new ThreadJoin();
        mt.start();

        for (int i = 0; i < 100;i++){
            System.out.println("主线程"+i);
        }
        System.out.println("主线程执行完毕！！！");
        try {
            mt.join(); //此时会让主线程等待子线程执行完毕，再继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("哈哈哈");
    }
}
