

import java.util.*;

class Book{
	String title;
	String author;
	boolean isAvailable;
	
	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.isAvailable=true;
		
	}
	
	void display() {
		System.out.println("title: "+title+", author: "+author+",status: "+(isAvailable ? "isAvailable" :"Checked Out"));
		
	}
}

class Library{
	Book[] books;
	int count=0;
	
	Library(int size){
		books=new Book[size];
	}
	
	void addBook(Book book) {
		if(count <books.length) {
			books[count++]=book;
		}
	}
	
	void displayBooks() {
		System.out.println("library books");
		for(int i=0;i<count;i++) {
			books[i].display();
		}
	}
	
	void searchBook(String keyword) {
		boolean found=false;
		System.out.println("search results");
		
		for(int i=0;i<count;i++) {
			if(books[i].title.toLowerCase().contains(keyword.toLowerCase())) {
				books[i].display();
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("np book found with given title");
		}
		
	}
	
	
	void checkoutBook(String title) {
		for(int i=0;i<count;i++) {
			if(books[i].title.equalsIgnoreCase(title)) {
				if(books[i].isAvailable) {
					books[i].isAvailable=false;
					System.out.println("book checked out successful");
				}
				else {
					System.out.println("book is already checked out ");
				}
				return;
			}
		}
		System.out.println("book not found");
	}
}

public class LibraryManagement {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		Library library=new Library(5);
		
		library.addBook(new Book("java programming","james gosling"));
		library.addBook(new Book("half girlfriend","chetan bhagat"));
		library.addBook(new Book("harry potter","j k rowling"));
		library.addBook(new Book("the boy who loved","durjoy dutta"));
		
		int choice;
		
		do {
			System.out.println("library menu");
			System.out.println("1. display books");
			System.out.println("2. search book by title");
			System.out.println("3. checkout book");
			System.out.println("4. exit");
			System.out.println("enter choice");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				library.displayBooks();
				break;
				
			case 2:
				System.out.println("enter title keyword");
				String keyword=sc.nextLine();
				library.searchBook(keyword);
				break;
			case 3:
				System.out.println("enter book title to checkout");
				String title=sc.nextLine();
				library.checkoutBook(title);
				break;
				
			case 4: 
				System.out.println("thank you for using our app");
				break;
				default:
					System.out.println("invalid choice");
			}
		}
		while(choice !=4);
		
		
		
	}

}
