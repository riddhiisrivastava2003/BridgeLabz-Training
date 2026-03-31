import java.util.*;

public class MovieTicketBookingApp {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of customers ");
		int customerCount=sc.nextInt();
		
		for(int customer=1;customer<=customerCount;customer++) {
			System.out.println("customer "+customer);
			
			System.out.println("enter the type of movie(2D/3D)");
			String movie=sc.next();
			
			System.out.println("enter the seat type(silver/gold)");
			String seat=sc.next();
			
			System.out.println("do you need snacks(yes/no)");
			String snacks=sc.next();
			
			int ticketPrice=0;
			
			
			switch(movie.toUpperCase()) {
			case "2D":
				ticketPrice=200;
				break;
			
			case "3D":
				ticketPrice=300;
				break;
			default:
				System.out.println("invalid movie type");
				continue;
			
		}
			
			if(seat.equalsIgnoreCase("gold")) {
				ticketPrice=ticketPrice+100;
			}
			else if(seat.equalsIgnoreCase("silver")) {
				ticketPrice=ticketPrice+75;
			}
			else {
				System.out.println("invalid seat type");
				continue;
			}
			
			
			if(snacks.equalsIgnoreCase("yes")) {
				ticketPrice=ticketPrice+80;
				
			}
			
			System.out.println("your total ticket price is INR "+ticketPrice);
	}

}
}
