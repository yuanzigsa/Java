package MultiThreading;

public class MyThreadPriorityTest {
    public static void main(String[] args) {
        MyThreadPriority mt1 = new MyThreadPriority("A�߳�");
        MyThreadPriority mt2 = new MyThreadPriority("B�߳�");

        mt2.setPriority(10); //�����ȼ������ǲ���ζ�Ŷ�ռcpu
        mt1.setPriority(1); //���ȼ��ͣ���������ִ��
        mt1.start();
        mt2.start();
    }
}
