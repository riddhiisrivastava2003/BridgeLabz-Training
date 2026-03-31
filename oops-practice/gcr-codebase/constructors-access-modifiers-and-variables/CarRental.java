

import java.util.*;


 class CarRental {
	 
	 String customer;
	 String model;
	 int days;
	 double cost=1200;
	 
	 
	 CarRental(){
		 customer="Customer";
		 model="model";
		 days=1;
		 
	 }
	 
	 CarRental(String customer, String model, int days){
		 this.customer=customer;
		 this.model=model;
		 this.days=days;
	 }
	 
	 
	 double totalCost() {
		 return cost*days;
	 }
	 
	 void display() {
		 System.out.println("customer name "+customer+" model "+model +" days "+days+" total cost "+totalCost());
	 }
	 
	 public static void main(String args[]) {
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("enter customer name");
		 String name=sc.nextLine();
		 
		 System.out.println("enter model ");
		 String model=sc.nextLine();
		 
		 System.out.println("enter days");
		 int days=sc.nextInt();
		 
		 
		 CarRental r=new CarRental(name,model,days);
		 r.display();
	 }
	 
	
	

}
