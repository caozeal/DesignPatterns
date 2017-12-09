/**
 * <p>创建时间：2017/12/9 18:11
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay cd = new CharDisplay('c');
        AbstractDisplay sd = new StringDisplay("Hello world!");
        cd.display();
        sd.display();
    }
}
