import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        EventManager manager=new EventManager();

        System.out.println("enter number of ticket");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("enter price of ticket number "+(i+1));
            double price=sc.nextDouble();
            manager.addTicket(price);
        
        }

        System.out.println("beefore sorting");
        manager.showTicket();

        System.out.println("after sorting");
        manager.sortTickets();

        manager.showTicket();

        System.out.println("after sorting ");
        manager.showTicket();

        System.out.println("top 3 cheapest");
        manager.showTopCheapest(3);

        System.out.println("top 3 expensive");
        manager.showTopExpensive(3);
    





    }
}