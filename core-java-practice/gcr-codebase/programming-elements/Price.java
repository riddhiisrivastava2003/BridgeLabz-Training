import java.util.*;
public class ItemCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int unitPrice=sc.nextInt();
        int quantity=sc.nextInt();
        int total=quantity*unitPrice;
        System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR "+unitPrice );
    }
}