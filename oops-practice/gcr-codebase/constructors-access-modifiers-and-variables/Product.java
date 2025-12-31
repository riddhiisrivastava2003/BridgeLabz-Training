

import java.util.Scanner;

class Product {
	String productName ;
	double price;

	static int totalProducts = 0;
	

	Product(String productName , double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}

	
	void displayProductdetails() {
		System.out.println("Product Name : " + productName );
		System.out.println("Price: " + price);
		
	}
	
	
	static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		Product p = new Product(name , price);
		p.displayProductdetails();
		Product.displayTotalProducts();
		
	}
	

}