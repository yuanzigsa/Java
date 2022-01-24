package MultiThreading;

public class MyThreadPriority extends Thread {
    public MyThreadPriority(String name){
        super.setName(name); //设置线程的名字
    }
    @Override
    public  void  run(){
        for (int i = 0 ; i < 500; i++){
            System.out.println(super.getName()+"==>"+i);
        }
    }
}
