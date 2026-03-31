import java.util.*;


public class CartItem {
	
	String name;
	double price;
	int quantity;
	
	public void addItem(int quant) {
		quantity=quantity+quant;
		System.out.println("added "+quant+" of "+name +" to the cart");
	}
	
	public void removeItem(int quant) {
		if(quant<=quantity) {
			quantity=quantity-quant;
			System.out.println("removed "+quant+" of "+name+" from cart");
			
		}
		else {
			System.out.println("cannot remove items from the card");
		}
	}
	
	public void display() {
		double cost=price*quantity;
		System.out.println("the total cost is "+cost);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		CartItem item=new CartItem();
		
		System.out.println("enter the item name");
		item.name=sc.nextLine();
		
		System.out.println("enter price ");
		item.price=sc.nextDouble();
		
		System.out.println("enter initial quantity");
		item.quantity=sc.nextInt();
		
		System.out.println("\nItem "+item.name+", Price "+item.price+", quantity "+item.quantity);
		
		System.out.println("enter quantity to add");
		int add=sc.nextInt();
		
		item.addItem(add);
		
		System.out.println("enter quantity to remove");
		int remove=sc.nextInt();
		item.removeItem(remove);
		
		item.display();
	}
	
	

}