/**
 * <p>创建时间：2017/12/10 19:50
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class TicketMaker {

    private static TicketMaker ticketMaker= new TicketMaker();

    private TicketMaker(){

    }
    private int ticket = 1000;

    /**
     * **注意多线程同步**
     * @return
     */
    public synchronized int getNectTicketNumber(){
        return ticket++;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }
}
