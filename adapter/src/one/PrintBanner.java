package one;

/**
 * <p>创建时间：2017/12/3 17:33
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String s) {
        super(s);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
