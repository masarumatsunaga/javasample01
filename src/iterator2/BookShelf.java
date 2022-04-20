package iterator2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 本棚の役割
public class BookShelf implements Iterable<Book> {

	private List<Book> books;
	private int last = 0;

	public BookShelf(int maxsize) {
		books = new ArrayList<>(maxsize);
	}
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}


}
