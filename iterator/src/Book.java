/**
 * <p>创建时间：2017/12/2 15:20
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
