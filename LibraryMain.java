import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
//Alens evra csc250
public class LibraryMain {

	static String fileName = null;
	static Library lib = new Library(); //from library class
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main (String[] args) {
		while(running) {
			System.out.println("\0Enter 0 to register for library" + "\nEnter 1 to quit" + "\nEnter 2 for list all books" + "\nEnter 3 for add to library");
			int answer = in.nextInt();
			switch (answer) {
			case 0:
			System.out.println("you have registered create username");
			fileName = in.next();
			loadScript(fileName);
			break;
				
			//calls method to quit	
			case 1:
				Quitlib();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				addBook(); //calls add book method
				break;
			}
		}
		System.exit(0); //quits program
	}
			
			
		
	private static void loadScript(String name) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream in = null;

File file = new File (name+".ser");
		if (file.exists()){
		try {
		fis = new FileInputStream(file);
		in = new ObjectInputStream(fis);
		lib = (Library) in.readObject();
		fis.close();
		in.close();
				//uses input stream to read  library class
				
			}catch (IOException e) {
				
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
		}
		
		} else { 
		 System.out.println("\n Continue by following the instructions below "
		 		+ ""
		 		+ "you must add book before you can list");
		}
	}
	// TODO Auto-generated method stub
private static void addBook() {
	
	 int quantity;
	  String Bookname, Author, bookID;
	  
	  System.out.print("\nEnter name of book: ");
	  Bookname = in.next();
	  
	  System.out.print("\nEnter name of Author: ");
	  Author = in.next();

	  System.out.print("\nEnter the book's ID: ");
	  bookID= in.next();

	  System.out.print("\nEnter the quantity: ");
	  quantity = in.nextInt();
	  
	 Book b = new Book( quantity,  Bookname,  Author,  bookID);
	 lib.addlibrarybook(b); //call from Book class
}
 private static void Quitlib() {
		System.out.println("you have quit: ");
		fileName = in.next() + ".ser";
		running = false ; //option to shut program when not running
		FileOutputStream fos = null;
		ObjectOutputStream out = null;	
		try {
		fos = new FileOutputStream (fileName);
		out = new ObjectOutputStream(fos);
		out.writeObject(lib);
		fos.close();
		out.close();
		
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		}	catch (IOException e) {
				e.printStackTrace();
		}
	}

}

