

import java.util.*;

public class BookDetails {

	String title;
	String author;
	double price;
	
	public void displayDetails() {
		System.out.println("the title of the book is "+title);
		System.out.println("the author of the book is "+author);
		System.out.println("the price of the book is "+price);
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of books");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		
		BookDetails[] books=new BookDetails[n];
		
		
		
		for(int i=0;i<n;i++) {
			books[i]=new BookDetails();
			System.out.println("enter details for book number "+(i+1));
			
			System.out.println("enter title");
			books[i].title=sc.nextLine();
			System.out.println("enter author");
			books[i].author=sc.nextLine();
			System.out.println("enter price");
			books[i].price=sc.nextDouble();
			
			sc.nextLine();
		}
		
		
		System.out.println();
		for(int i=0;i<n;i++) {
			books[i].displayDetails();
		}
	}
}
