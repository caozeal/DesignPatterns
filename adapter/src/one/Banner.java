package one;

/**
 * <p>创建时间：2017/12/3 17:29
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Banner {

    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void showWithParen(){
        System.out.println("(" + s + ")");
    }

    public void showWithAster(){
        System.out.println("*" + s + "*");
    }
}
