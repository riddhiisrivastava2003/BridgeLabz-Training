import java.util.*;
public class FoodDeliveryMain{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        DeliveryService service=new DeliveryService();

        service.addAgent(new Agent(101));
        service.addAgent(new Agent(102));
        service.addAgent(new Agent(103));
        service.addAgent(new Agent(104));
        service.addAgent(new Agent(105));


        while(true){

            System.out.println("1. Place Order");
            System.out.println("2. Assign Order");
            System.out.println("3. Cancel Order");
            System.out.println("4. View Active Deliveries");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice=sc.nextInt();
            sc.nextLine();

            try{
                switch(choice){

                    case 1:
                        System.out.print("Enter order id: ");
                        int orderId=sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Location: ");
                        String location=sc.nextLine();

                        service.placeOrder(new Order(orderId,location));
                        break;
                    case 2:
                        service.assignOrder();break;
                    case 3:
                        System.out.print("Enter order id to cancel: ");
                        orderId=sc.nextInt();
                        service.cancelOrder(orderId);
                        break;
                    case 4:
                        service.viewActiveDeliveries();
                        break;
                    case 5:
                        System.out.println("System exiting..");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice");                  
                }
            }
            catch(NoAgentAvailableException e){
                System.err.println(e.getMessage());
            }
        }
    }
}