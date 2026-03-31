package online_auction_biddingsystem;

import java.util.*;


public class AuctionMain {
	
	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	
	//AuctionItem auction1=new AuctionItem("Phone");
//	AuctionItem auction2=new AuctionItem("Laptop");
//	AuctionItem auction3=new AuctionItem("Tablet");
	
	
//	User user1=new User("Riddhi");
//	User user2=new User("DK");
//	User user3=new User("Aditi");
//	User user4=new User("Surya");
//	
	
	
	
	
	
	
	
	
//	try {
//		
//		
//		
//		auction1.bidplacing(user1,50000);
//		auction1.bidplacing(user2,60000);
//		auction1.bidplacing(user3,70000);
//		auction1.bidplacing(user4,80000);
//	}
	
	
	
	
//	catch(InvalidBidException e) {
//		System.out.println(e.getMessage());
//	}
//	auction1.showHighestBid();
//	auction2.showHighestBid();
//	auction3.showHighestBid();
	
	
	System.out.println("online auction bidding system");
	
	System.out.print("enter item name for auction: ");
	String itemName=sc.nextLine();
	
	AuctionItem item=new AuctionItem(itemName);
	
	while(true) {
		System.out.println("----menu----");
		System.out.println("1. place bid");
		System.out.println("2. show highest bid");
		System.out.println("3. show all bids");
		System.out.println("4. exit");
		System.out.print("enter your choice");
		int choice=sc.nextInt();
		sc.nextLine();
		
		if(choice<1 || choice>4) {
			
			System.out.println("please enter a valid number!");
			
			
		}
		
		try {
			switch(choice) {
			
			case 1:
				System.out.print("enter user name: ");
				String name=sc.nextLine();
				
				System.out.print("enter bid amount: ");
				int amt=sc.nextInt();
				
				System.out.println();
				
				User user=new User(name);
				item.bidplacing(user,amt);
				break;
				
			case 2:
				
				System.out.println();
				item.showHighestBid();
				break;
				
			case 3:
				System.out.println();
				item.showAllBids();
				break;
				
			case 4:
				System.out.println();
				System.out.print("auction closed");
				sc.close();
				return;
				
			default:
				System.out.println();
				System.out.println("invalid choice");
				
				
				
			
			}
		}
		
		catch(InvalidBidException e) {
			System.err.println("error: "+e.getMessage());
			System.out.println();
		}
		
	}
	

}
}
