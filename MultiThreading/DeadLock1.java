package MultiThreading;

public class DeadLock1 extends Thread {

    @Override
    public void run(){
        synchronized (ResourceObject.obj1){
            System.out.println("锁定第一个资源");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ResourceObject.obj2){
                System.out.println("锁定第二个资源");

                System.out.println("执行完毕");
            }

        }
    }
}
