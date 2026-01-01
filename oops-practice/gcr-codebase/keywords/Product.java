
import java.util.*;

public class Product {
	
	private static double discount=10.0;
	private final String productID;
	private String productName;
	private double price;
	private int quantity;
	
	
	public Product(String productID, String productName,double price,int quantity) {
		this.productID=productID;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		
		
	}
	
	public static void updateDiscount(double newDiscount) {
		discount=newDiscount;
	}
	
	public double getAfterDiscount() {
		return price-(price*discount/100);
	}
	
	public void displayDetails() {
		if(this instanceof Product) {
			System.out.println("product id: "+productID );
			System.out.println("product name: "+productName);
			System.out.println("price: "+price);
			System.out.println("quantity: "+quantity);
			System.out.println("discount: "+discount+"%");
			System.out.println("price after discount: "+getAfterDiscount());
			
		}
		else {
			System.out.println("invalid product ");
			}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of products: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Product[] product=new Product[n];
		
		System.out.println("enter discount percentage: ");
		double d=sc.nextDouble();
		
		sc.nextLine();
		
		Product.updateDiscount(d);
		
		for(int i=0;i<n;i++) {
			System.out.println("enter details for product "+(i+1));
			
			System.out.println("enter product id: ");
			String id=sc.nextLine();
			
			System.out.println("enter product name ");
			String name=sc.nextLine();
			
			System.out.println("enter price ");
			double price=sc.nextDouble();
			
			System.out.println("enter quantity ");
		 int qt=sc.nextInt();
			sc.nextLine();
			
			product[i]=new Product(id,name,price,qt);
			
			
			
			
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++) {
			product[i].displayDetails();
		}
		
	}
	

}
