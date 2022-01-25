package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class TicketTest {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<Ticket>();

        for (int i = 0; i < 1000; i++){
            Ticket t = new Ticket(i,"火车票"+i);
            ticketList.add(t);
        }
        //创建窗口
        TableThread tt1 = new TableThread(ticketList,"窗口一");
        TableThread tt2 = new TableThread(ticketList,"窗口二");
        TableThread tt3 = new TableThread(ticketList,"窗口三");
        TableThread tt4 = new TableThread(ticketList,"窗口四");

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();

    }
}
