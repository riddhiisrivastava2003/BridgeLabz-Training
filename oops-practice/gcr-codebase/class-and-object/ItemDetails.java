



import java.util.*;

public class ItemDetails {

	String itemCode;
	String itemName;
	double price;
	
	public void displayDetails(int quantity) {
		System.out.println("the itemcode is "+itemCode);
		System.out.println("the item name is "+itemName);
		System.out.println("the price  "+price);
		System.out.println("total cost "+quantity+" : "+(price*quantity));
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of items");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		
		ItemDetails[] items=new ItemDetails[n];
		int[] quantities=new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			items[i]=new ItemDetails();
			System.out.println("enter details for items "+(i+1));
			
			System.out.println("enter item code");
			items[i].itemCode=sc.nextLine();
			System.out.println("enter item name");
			items[i].itemName=sc.nextLine();
			System.out.println("enter price");
			items[i].price=sc.nextDouble();
			System.out.println("enter quantity");
			quantities[i]=sc.nextInt();
			sc.nextLine();
			
			
			sc.nextLine();
		}
		
		
		System.out.println();
		for(int i=0;i<n;i++) {
			items[i].displayDetails(quantities[i]);
		}
	}
}
