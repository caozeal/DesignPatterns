import java.util.ArrayList;
import java.util.List;

/**
 * <p>创建时间：2017/12/2 15:27
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class BookShelf implements Aggregate{

    private List<Book> books;

    public BookShelf(int maxsize){
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}
