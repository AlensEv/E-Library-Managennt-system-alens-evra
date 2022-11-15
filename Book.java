
import java.io.Serializable;


public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int quantity;
	private String Bookname, Author, bookID;
	// this is the book class for Library main
	public Book() {
		quantity=0;
		Bookname =null;
		Author = null;
		bookID = null;
	}
	// book attributes
	public Book( int quantity, String Bookname, String Author ,String bookID) {
		this.quantity = quantity;
		this.Bookname = Bookname;
		this.Author = Author;
		this.bookID = bookID;
	}
	@Override
	public String toString(){
		return "\nname: " + Bookname + "\nAuthor: "+ Author + "\nquantity: " + quantity + "\nbookID"+ bookID +"\n"; 
	}
}
