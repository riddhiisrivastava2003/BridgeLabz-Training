


import java.util.*;


public class ElectionBoothManager {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		
		System.out.println("Enter the age of the candidate or 0 to exit");
		int age=sc.nextInt();
		
		if(age==0) {
			System.out.println( "Thanks for visiting!!");

			break;
		}
		
		else if(age<0) {
			System.out.println("Invalid age...Please enter valid  age");
			
		}
		else if(age>0 && age<18) {
			System.out.println("Regret to inform you that you are NOT ELIGIBLE to vote!!!");
			
			System.out.println("Thanks for visiting!!!");
		}
		
		else {
			System.out.println("You are ELIGIBLE to vote!!!");
			System.out.println("Enter your vote(1/2/3/4)");
			int vote=sc.nextInt();
			System.out.println("Your vote for "+vote+" has been recorded!!");
			System.out.println("Thanks for visiting!!!");
			
		}
	}
}
	
	

}
