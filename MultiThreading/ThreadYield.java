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
                Thread.yield(); //当出现i%y10 == 0的时候，让出CPU
            }
        }
    }
}
