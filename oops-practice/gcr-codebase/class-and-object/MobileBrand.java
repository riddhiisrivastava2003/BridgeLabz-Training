

import java.util.Scanner;

public class MobileBrand {

	String brand;
	String model;
	double price;
	
	public void displayDetails() {
		System.out.println("the brand is "+brand);
		System.out.println("the model is "+model);
		System.out.println("the price  "+price);
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of items");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		
		MobileBrand[] phone=new MobileBrand[n];
		//int[] quantities=new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			phone[i]=new MobileBrand();
			System.out.println("enter details for items "+(i+1));
			
			System.out.println("enter brand");
			phone[i].brand=sc.nextLine();
			System.out.println("enter model");
			phone[i].model=sc.nextLine();
			System.out.println("enter price");
			phone[i].price=sc.nextDouble();
			//System.out.println("enter quantity");
			//quantities[i]=sc.nextInt();
			sc.nextLine();
			
			
			
		}
		
		
		System.out.println();
		for(int i=0;i<n;i++) {
			phone[i].displayDetails();
		}
	}
}
