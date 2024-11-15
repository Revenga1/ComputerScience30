package Library;

import java.util.ArrayList;

//Open MIT Courses: https://ocw.mit.edu/courses/6-092-introduction-to-programming-in-java-january-iap-2010/pages/assignments/


public class Library {
    // Add the missing implementation to this class
	private String adress;
	private ArrayList<Book> books;
	private String openTime;
	private String closeTime;

    public Library(String name) {
    	this.adress= name;
    	this.books = new ArrayList<Book>();
    	this.openTime= "10:00 am";
    	closeTime= "8:00 pm";
	}
    public void addBook(Book book) {
    	books.add(book);
    	
    }
    public void printAddress() {
    	System.out.print("\nthe library adress is: " + this.adress);
    	
    }
    public void printOpeningHours() {
    	System.out.println(this.openTime + "to" + this.closeTime);
    	
    	
    }
    
    public void printAvailableBooks() {

    	for (int i = 0; i < books.size(); i++) {//i stands for index
    		Book currentBook = books.get(i);	
    		if(!currentBook.isBorrowed()) {
//    			System.out.println(books.get(i).title);  <---- shorter version
    			System.out.println(currentBook.title);
    			
    		}
    		
    	}
     }

    public void borrowBook(String borrowName) {
    	
    	boolean found= false;
    	for(int i =0; i< books.size(); i++) {
    		Book currentBook = books.get(i);
    		String bookName = currentBook.getTitle();
//    		System.out.println(bookName + !currentBook.isBorrowed() );
    		
    		if(currentBook.getTitle().equals(borrowName)&&!currentBook.isBorrowed()) {
    			found = true;
    			currentBook.borrowed();
//    			books.set(i, currentBook.)
    			//pass by value or pass by reference? (copy)
    			//currentBook - variable is pointing to the original book object in memory!
//    			System.out.println("Book in library class: " + books.get(i).isBorrowed());
    		System.out.println(bookName+ " Was checked out");
    		}
    	}
    	
    	if(!found) {
    		System.out.println("Book was not found or unavaliable");
    	}
    	
    }
    private void returnBook(String retBook) {
    	
    	
    	boolean found = false;
    	
    	for(int i = 0; i < books.size(); i++) {
    		Book currBook = books.get(i);
    		String bookName = currBook.getTitle();
    		if(bookName.equals(retBook)&&currBook.isBorrowed()) {
    			found = true;
    			currBook.returned();
    			System.out.println(retBook + " Was returned");
    		}
    	}
    	if(!found) {
    		System.out.println("Book was not found or was not checked out");
    	}
    	
    }
    
	public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();
        secondLibrary.printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }

} 