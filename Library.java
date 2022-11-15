
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Library  extends Object implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Book> collection;
	//
	public Library(int quantity, String bookname, String author, String bookID){
		 collection = new ArrayList<Book>();
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public void addlibrarybook(Book book) {
	collection.add(book);
	
	}
	@Override
	public String toString() {
		String total = "\n";
//uses iterator to accept accept books
		Iterator <Book> i = collection.iterator();
		while(i.hasNext()) {
			Book b = (Book) i.next();
			total = total + b.toString();
			
	}
		return total;
	}
}

	