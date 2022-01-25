package MultiThreading;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TableThread extends Thread {
    private List<Ticket> ticketList;
    private static AtomicInteger i = new AtomicInteger();

    public TableThread(List<Ticket> ticketList,String name){
        this.ticketList = ticketList;
        super.setName(name);

    }
    @Override
    public void run(){
        while (true) {
            if (i.get() + 4  < ticketList.size()) {
                try {
                    Thread.sleep(new Random().nextInt(150)); //150������������һ��Ʊ
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Ticket t = ticketList.get(i.incrementAndGet()); //i++
                System.out.println(super.getName() + "����:" + t.getName());
            }else {
                System.out.println("������");
                break;
            }
        }
    }
}
