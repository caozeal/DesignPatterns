/**
 * <p>创建时间：2017/12/9 17:55
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public abstract class AbstractDisplay {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display(){
        open();
        for (int i=0; i<5; i++){
            print();
        }
        close();
    }
}
