/**
 * <p>创建时间：2017/12/9 18:01
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class StringDisplay extends AbstractDisplay {

    private String s;

    public StringDisplay(String s) {
        this.s = s;
    }

    @Override
    protected void open() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < s.getBytes().length; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    protected void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    protected void close() {
        printLine();
    }
}
