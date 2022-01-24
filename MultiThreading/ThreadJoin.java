package MultiThreading;

public class ThreadJoin extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("×ÓÏß³Ì"+i);
        }
    }
}
