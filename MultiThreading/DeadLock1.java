package MultiThreading;

public class DeadLock1 extends Thread {

    @Override
    public void run(){
        synchronized (ResourceObject.obj1){
            System.out.println("������һ����Դ");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ResourceObject.obj2){
                System.out.println("�����ڶ�����Դ");

                System.out.println("ִ�����");
            }

        }
    }
}
