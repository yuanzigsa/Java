package MultiThreading;

public class MyThreadPriority extends Thread {
    public MyThreadPriority(String name){
        super.setName(name); //�����̵߳�����
    }
    @Override
    public  void  run(){
        for (int i = 0 ; i < 500; i++){
            System.out.println(super.getName()+"==>"+i);
        }
    }
}
