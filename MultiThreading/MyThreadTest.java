package MultiThreading;

public class MyThreadTest {
    public static void main(String[] args) { //���߳�
        //1. �����̶߳���
        MyThread mt = new MyThread();
        //2. ����strat������������һ���߳�
        mt.start(); //�̳���Thread�࣬����һ���߳� -> �Զ�ִ��run��������
       for(int i = 0; i < 1000; i++){
           System.out.println(">>>>>>>�������߳�"+i);
       }
    }
}
