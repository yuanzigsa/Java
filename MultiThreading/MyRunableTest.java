package MultiThreading;

public class MyRunableTest {
    public static void main(String[] args) {
       //1. �ȴ���Runable�Ķ���
        Runnable r = new MyRunable();
        //2. �����̶߳��󣬱���ָ���ҵ�Runable
        Thread t = new Thread(r);
        t.start();

        for (int i =0;i<1000;i++){
            System.out.println(">>>>>>�������߳�"+i);
        }
    }
}
