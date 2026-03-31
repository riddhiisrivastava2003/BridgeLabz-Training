

import java.util.*;

 class LibrarySystem {
	 
	 String title;
	 String author;
	 double price;
	 boolean available;
	 
	 LibrarySystem(String title,String author,double price){
		 this.title=title;
		 this.author=author;
		 this.price=0.0;
		 this.available=true;
	 }
	 
	 void borrow() {
		 if(available) {
			 available=false;
			 System.out.println("you can borrow a book");
		 }
		 else {
			 System.out.println("book not available");
		 }
	 }
	 
	 void display() {
	 System.out.println("title: "+title+" author "+author+" available "+available);
	 
 }
	 
	 public static void main(String args[]) {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter title ");
		 String t=sc.nextLine();
		 
		 System.out.println("enter author ");
		 String a=sc.nextLine();
		 
		 System.out.println("enter price ");
		 double p=sc.nextDouble();
		 
		 LibrarySystem library=new LibrarySystem(t,a,p);
		 
		 library.display();
		 library.borrow();
		 library.display();
	 }
	

}
