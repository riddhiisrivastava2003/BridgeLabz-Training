import java.util.*;
public class EcommerceManagement {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Product p1=new Product(101,"Laptop",45000);
        Product p2=new Product(102,"Mobile",15000);
        Product p3=new Product(103,"HeadPhones",5000);
        Product p4=new Product(104,"Speaker",4500);
        Product p5=new Product(105,"Television",25000);

        System.out.println("welcome to e-commerece");

        System.out.print("enter yout name:");
        String name=sc.nextLine();

        Customer customer=new Customer(1, name);

        System.out.println("hello "+customer.getName());
        System.out.println("available products...");
        System.out.println("1. laptop: 45000");
        System.out.println("2. mobile: 15000");
        System.out.println("3. headphones: 5000");
        System.out.println("4. speaker: 4500");
        System.out.println("5. television: 25000");

        System.out.println("Select product(1-5)");

        int choice=sc.nextInt();

        Product selectProduct=null;

        if(choice==1) selectProduct=p1;
         else if(choice==2) selectProduct=p2;
          else if(choice==3) selectProduct=p3;
           else if(choice==4) selectProduct=p4;
            else if(choice==5) selectProduct=p5;
            else {System.out.println("invalid choice"); return;}

            Order order=new Order(5001, selectProduct);

            System.out.println("order placed for "+selectProduct.getName());

            System.out.println("choose payment mode ");
            System.out.println("1. card");
             System.out.println("2. wallet");
              System.out.println("3. upi");

              int payChoice=sc.nextInt();

              Payment payment;

              if(payChoice==1) payment=new CardPayment();
              else if(payChoice==2) payment=new WalletPayment();
              else payment=new UpiPayment();
             
              try{
                payment.pay(order.getAmount());

              }
              catch(PaymentFailedException e){
                    System.out.println("payment failed "+e.getMessage());
              }

              System.out.println("1. track Order");
              System.out.println("2. cancel Ordre");
              System.out.println("choose");
              int option=sc.nextInt();

              if(option==1){
                order.trackOrder();
                return;
              }
              else{
                order.cancelOrder();

              }


    }
    
}
