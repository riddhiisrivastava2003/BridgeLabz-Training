package online_auction_biddingsystem;

public class Bid {
	
		private User user;
		private int amount;
		
		//user ki details user class se le li and saath m amt enter kara liya
		
		public Bid(User user, int amount) {
			this.user=user;
			this.amount=amount;
		}
		
		//getter bana kar ke dono ke values le liye
		//getter 
		
		public User getUser(){
		   return user;
			
		}
		
		//getter
		
		public int getAmount() {
			return amount;
		}
		

}
