
import java.util.*;

public class MetroSmartCardFareDeduction {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your balance!!");
		int balance=sc.nextInt();
		
		while(balance>0) {
			System.out.println("Enter the distance or 0 to exit!!");
			int distance=sc.nextInt();
			
			if(distance==0) {
				System.out.println("Thanks for visiting!!");
				break;
				
			}
			
			int fare=(distance<=5) ?10:(distance<=15)?20:30;
			
			if (balance>=fare) {
				balance=balance-fare;
				System.out.println("Your fare for "+distance+"km is "+fare+" and your remaining balance is "+balance);
				System.out.println("Have a safe and happy journey!!!");
			}
			else {
				System.out.println("Insufficient balance to complete the journey!!");
			}
		}
	}

}
