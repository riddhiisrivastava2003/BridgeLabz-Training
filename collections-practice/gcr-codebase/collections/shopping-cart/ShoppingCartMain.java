import java.util.*;
public class ShoppingCartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		System.out.println("enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();


		for(int i = 0; i< n ; i++) {


			System.out.println("\nenter product "+(i+1));
			System.out.print("product name: ");
			String name = sc.nextLine();


			System.out.print("product price: ");
			double price = sc.nextDouble();
			sc.nextLine();

			
			Product product = new Product(name, price);
            cart.addProduct(product);
        }

        cart.displayCart();
        cart.displaySortedByPrice();
		
		
	}

}