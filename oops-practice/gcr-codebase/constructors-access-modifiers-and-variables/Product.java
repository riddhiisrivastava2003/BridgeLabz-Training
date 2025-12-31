

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

	
	void displayProductDetails() {
		System.out.println("Product Name : " + productName );
		System.out.println("Price: " + price);
		
	}
	
	
	static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("no of products to be created");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){

            System.out.println("enter details for product "+i);
		
		System.out.println("Enter Product Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
         sc.nextLine();
		
		Product p = new Product(name , price);
		p.displayProductDetails();
        }
		Product.displayTotalProducts();
		
	}
	

}