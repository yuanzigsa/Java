package MultiThreading;

public class MyThreadTest {
    public static void main(String[] args) { //主线程
        //1. 创建线程对象
        MyThread mt = new MyThread();
        //2. 调用strat（）方法启动一个线程
        mt.start(); //继承自Thread类，启动一个线程 -> 自动执行run（）方法
       for(int i = 0; i < 1000; i++){
           System.out.println(">>>>>>>我是主线程"+i);
       }
    }
}
