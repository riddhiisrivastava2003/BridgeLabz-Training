

import java.util.*;

public class LeapYearCheck {
	
	public static boolean isleapYear(int year) {
		return(year %400==0)||(year %4==0 && year%100 !=0);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		
		int year=sc.nextInt();
		
		if(year<1582) {
			System.out.println("year must be greater than 1582");
			
		}
		else if(isleapYear(year)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
