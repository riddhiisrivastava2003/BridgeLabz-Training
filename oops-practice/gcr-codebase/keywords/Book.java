import java.util.*;

public class Book {
	
	private static String libraryName="sukh dukh ka sathi";
	private  String title;
	private  String author;
	
	private static int totalBooks=0;
	private final  String isbn;
	
	public Book(String title,String author, String isbn ) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		
		totalBooks++;
		
		
	}
	
	public static void displayLibraryName() {
		System.out.println("the library name is "+libraryName);
	}
	
	public static void displayTotalBooks() {
		System.out.println("the total number of books are "+totalBooks);
	}
	
	public void displayBookDetails() {
		if(this instanceof Book ) {
			System.out.println("book title: "+title);
			System.out.println("author name: "+author);
			System.out.println("isbn: "+isbn);
		}
		else {
			System.out.println("invalid book instance");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of books ");
		int n=sc.nextInt();
		sc.nextLine();
		
		
		Book[] book=new Book[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter details for book "+(i+1));
			
			System.out.println("enter title ");
			String title=sc.nextLine();
			
			System.out.println("enter author");
			String author=sc.nextLine();
			
			System.out.println("enter isbn");
			String isbn=sc.nextLine();
			
			book[i]=new Book(title,author,isbn);
			
			
		}
		
		System.out.println();
		Book.displayLibraryName();
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.println("book details for book "+(i+1));
			book[i].displayBookDetails();
		}
		
		System.out.println();
		Book.displayTotalBooks();
		
		
	}
	
	
	
	
	
	

}
