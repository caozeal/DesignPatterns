/**
 * <p>创建时间：2017/12/2 15:49
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("《鸿门宴》"));
        bookShelf.appendBook(new Book("《卡耐基的魅力口才与处世智慧》"));
        bookShelf.appendBook(new Book("《软技能》"));
        bookShelf.appendBook(new Book("《带上微单去旅行》"));
        Iterator iterator = bookShelf.iterator();
        System.out.println(bookShelf.getLength());
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.toString());
        }
    }
}
