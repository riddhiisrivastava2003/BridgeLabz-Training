import java.util.*;
public class FeeCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fee=125000;
        int discountPercent=10;
        double discountAmt= (discountPercent/100.0)*fee;
        double discountedfee=fee-discountAmt;
        System.out.println("The discount amount is INR+ "+discountAmt+" and the discounted fee is INR "+discountedFee);
    }
}
