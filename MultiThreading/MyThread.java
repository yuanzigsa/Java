package MultiThreading;

public class MyThread extends Thread {
    @Override
    public void run(){
        //Ҫ�����߳�ִ�е�����д��run��
        for (int i = 0;i<1000;i++){
            System.out.println("�������߳�"+i);
        }
    }
}
