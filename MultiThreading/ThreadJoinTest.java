package MultiThreading;

public class ThreadJoinTest {
    public static void main(String[] args) {
        ThreadJoin mt = new ThreadJoin();
        mt.start();

        for (int i = 0; i < 100;i++){
            System.out.println("���߳�"+i);
        }
        System.out.println("���߳�ִ����ϣ�����");
        try {
            mt.join(); //��ʱ�������̵߳ȴ����߳�ִ����ϣ��ټ���ִ��
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("������");
    }
}
