package MultiThreading;

public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock1 dt1 = new DeadLock1();
        DeadLock2 dt2 = new DeadLock2();

        dt1.start();
        dt2.start();
    }
}
