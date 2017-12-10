/**
 * <p>创建时间：2017/12/10 19:43
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        if(a == b){
            System.out.println("a就是b");
        } else {
            System.out.println("a不是b");
        }
        System.out.println("end.");

        System.out.println("TicketMaker Start.");
        TicketMaker t1 = TicketMaker.getInstance();
        TicketMaker t2 = TicketMaker.getInstance();
        System.out.println(t1.getNectTicketNumber());
        System.out.println(t2.getNectTicketNumber());
        System.out.println("TicketMaker End.");
    }
}
