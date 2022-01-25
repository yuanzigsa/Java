package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class TicketTest {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<Ticket>();

        for (int i = 0; i < 1000; i++){
            Ticket t = new Ticket(i,"��Ʊ"+i);
            ticketList.add(t);
        }
        //��������
        TableThread tt1 = new TableThread(ticketList,"����һ");
        TableThread tt2 = new TableThread(ticketList,"���ڶ�");
        TableThread tt3 = new TableThread(ticketList,"������");
        TableThread tt4 = new TableThread(ticketList,"������");

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();

    }
}
