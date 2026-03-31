

import java.util.*;
public class BookNew{
	public String isbnNumber;
	protected String bookTitle;
	private String authorName;
	
	BookNew(String isbn,String title, String author){
		isbnNumber=isbn;
		bookTitle=title;
		authorName=author;
	}
	
	public String getAuthor() {
		return authorName;
	}
	
	public void setAuthor(String author) {
		authorName=author;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter isbn ");
		String isbn=sc.nextLine();
		
		System.out.println("enter book title ");
		String title=sc.nextLine();
		
		System.out.println("enter author name");
		String author=sc.nextLine();
		
		Ebook ebook=new Ebook(isbn,title,author) ;
			
			ebook.showBookDetails();
			
		}
	
	}
	
	class Ebook extends BookNew{
		Ebook(String isbn,String title,String author){
			super(isbn,title,author);
		}
		
		void showBookDetails() {
			System.out.println("isbn "+isbnNumber);
			System.out.println("title "+bookTitle);
			System.out.println("author "+getAuthor());
			
		}
	}


