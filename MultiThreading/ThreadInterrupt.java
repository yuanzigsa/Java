package MultiThreading;

public class ThreadInterrupt extends Thread {
    @Override
    public void run(){
        System.out.println("��Ҫ˯����" );
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            System.out.println("Ϊʲô����˯�ˣ�����");
        }
        System.out.println("����");
    }
}
