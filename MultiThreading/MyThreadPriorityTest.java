package MultiThreading;

public class MyThreadPriorityTest {
    public static void main(String[] args) {
        MyThreadPriority mt1 = new MyThreadPriority("A线程");
        MyThreadPriority mt2 = new MyThreadPriority("B线程");

        mt2.setPriority(10); //有优先级，但是不意味着独占cpu
        mt1.setPriority(1); //优先级低，不代表，不执行
        mt1.start();
        mt2.start();
    }
}
