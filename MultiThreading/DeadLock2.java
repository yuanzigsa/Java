package MultiThreading;

public class DeadLock2 extends Thread {
    @Override
    public void run(){
        synchronized (ResourceObject.obj2){
            System.out.println("锁定资源2");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ResourceObject.obj1){
                System.out.println("锁死第二个资源");
                System.out.println("执行完毕");
            }

        }
    }
}
