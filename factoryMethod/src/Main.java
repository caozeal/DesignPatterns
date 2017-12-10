import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

/**
 * <p>创建时间：2017/12/10 17:23
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小绿");
        card1.use();
        card2.use();
        card3.use();
    }
}
