

import  java.util.*;

public class MovieTicket {
	
	String name;
	String seat;
	double price;
	boolean isBooked=false;
	
	public void ticketBook(String name,String seat,double price) {
		if(isBooked) {
			System.out.println("Housefull!!!! sorry.....Ticket already booked");
			return ;
		}
		
		this.name=name;
		this.seat=seat;
		this.price=price;
		this.isBooked=true;
		
		System.out.println("ticket booked for "+name);
		System.out.println("seat number "+seat);
	}
	
	
	public void display() {
		if(!isBooked) {
			System.out.println("Ticket have not booked yet....");
			
		}
		else {
			System.out.println("price "+price);
			System.out.println();
			System.out.println("ticket booked for "+name);
			System.out.println("seat number "+seat);
			System.out.println("price "+price);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		MovieTicket movie=new MovieTicket();
		
		movie.display();
		
		
		System.out.println("enter the movie ");
		String name=sc.nextLine();
		
		System.out.println("enter seat number ");
		String seat=sc.nextLine();
		
		System.out.println("enter the price ");
		double price=sc.nextDouble();
		
		movie.ticketBook(name,seat,price);
		
		movie.ticketBook(name,seat,price);
		movie.ticketBook(name,seat,price);
		
		movie.display();
		
		
		
		
	}

}
