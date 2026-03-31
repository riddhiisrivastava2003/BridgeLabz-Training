

import java.util.*;

public class RohanLibraryReminderApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int finePerDay=5;
		
		for(int i=1;i<=5;i++) {
			System.out.println("book "+i);
			
			System.out.println("enter the due day ");
			int dueDay=sc.nextInt();
			
			System.out.println("enter return day ");
			int returnDay=sc.nextInt();
			
			if(returnDay>dueDay) {
				int daysLate=returnDay-dueDay;
				int totalFine=daysLate*5;
				
				System.out.println("book returned late by "+daysLate+" days");
				System.out.println("total fine is "+totalFine);
			}
			else {
				System.out.println("book returned on time");
			}
		}
	}

}
