package MultiThreading;

public class MyRunableTest {
    public static void main(String[] args) {
       //1. 先创建Runable的对象
        Runnable r = new MyRunable();
        //2. 创建线程对象，必须指向我的Runable
        Thread t = new Thread(r);
        t.start();

        for (int i =0;i<1000;i++){
            System.out.println(">>>>>>这是主线程"+i);
        }
    }
}
