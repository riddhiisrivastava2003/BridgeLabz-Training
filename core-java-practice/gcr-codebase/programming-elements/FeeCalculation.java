import java.util.*;
public class FeeCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fee=125000;
        int discountPercent=10;
        double discountamt= (discountPercent/100.0)*fee;
        double discountedfee=fee-discountamt;
        System.out.println("The discount amount is INR+ "+discountamt+" and the discounted fee is INR "+discountedfee);
    }
}