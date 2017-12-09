/**
 * <p>创建时间：2017/12/9 17:58
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class CharDisplay extends AbstractDisplay{

    private char c;
    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(c);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }

}
