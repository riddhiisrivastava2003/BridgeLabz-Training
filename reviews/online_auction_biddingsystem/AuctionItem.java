package online_auction_biddingsystem;

import java.util.*;

public class AuctionItem {
	
	//sabse phle item ka naam enter kara  liya
	
	
	private String item;
	
	//treemap banaya bidding naam ka
	
	TreeMap<Integer, User> bidding=new TreeMap<>();
	
	public AuctionItem(String item) {
		this.item=item;
	}
	
	//bidplacing banaya function usme user details and amount leliya
	
	public void bidplacing(User user,int amount) throws InvalidBidException {
		
		//agar entered amount current sabse chote amt se chota h to exception throw hoga 
		
		//if(!bidding.isEmpty() && amount<=bidding.firstKey()) {
		
		if(!bidding.isEmpty() && amount<=bidding.firstKey()) {
			throw new InvalidBidException("the bidding amount must be higher than the current amt "+bidding.lastKey());
			
		}
		
		//warna bidding map me user aur amount add ho jayenge 
		
		
		
		bidding.put(amount,user);
		System.out.println("user: "+user.getName()+" amount: "+amount);//name and amount le liya 
		
		
			
			
			//Map<>
		
			
			
		}
	public void showHighestBid(){
		
		//highest bid daal diya 
		if(bidding.isEmpty()) {
			System.out.print("No bids present yet");
			return;
		}
		
		
		//Map.Entry<Integer, User> highestBid=bidding.lastEntry();
		
		Map.Entry<Integer, User> highestBid=bidding.lastEntry();
		System.out.println("the highest bid is: "+highestBid.getKey()+" for item: "+item+" by user: "+highestBid.getValue().getName());
		
		
		
		
	}
	
	public void showAllBids() {
		if(bidding.isEmpty()) {
			System.out.print("no bids yet");
			return;
		}
		
		System.out.println("all bids for "+item);
		for(Map.Entry<Integer, User> entry:bidding.entrySet()) {
			System.out.println(entry.getValue().getName()+" -> "+entry.getKey());
		}
		
		
		
	}
	

}
