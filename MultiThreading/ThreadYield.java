package MultiThreading;

public class ThreadYield extends Thread {

    public ThreadYield(String name){
        super.setName(name);
    }
    @Override
    public void run(){
        for (int i = 0; i <500; i++){
            System.out.println(super.getName()+":"+i);
            if (i %10 == 0){
                Thread.yield(); //������i%y10 == 0��ʱ���ó�CPU
            }
        }
    }
}
