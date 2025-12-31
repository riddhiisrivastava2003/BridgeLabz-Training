
import java.util.*;

class HotelBooking {
	
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking(){
		
		guestName="Guest";
		roomType="standard";
		nights=1;
		
	}
	
	HotelBooking(String guestName, String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
		
	}
	
	HotelBooking(HotelBooking hotel){
		this.guestName=hotel.guestName;
		this.roomType=hotel.roomType;
		this.nights=hotel.nights;
	}
	
	
	void display() {
		System.out.println("Guest Name: "+guestName+" Room Type "+roomType+" nights:  "+nights);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter room type");
		String room=sc.nextLine();
		
		System.out.println("enter number of nights");
		int night=sc.nextInt();
		
		HotelBooking h1=new HotelBooking();
		HotelBooking h2=new HotelBooking(name,room,night);
		HotelBooking h3=new HotelBooking(h2);
		
		h1.display();
		h2.display();
		h3.display();
	}
	
	

}
