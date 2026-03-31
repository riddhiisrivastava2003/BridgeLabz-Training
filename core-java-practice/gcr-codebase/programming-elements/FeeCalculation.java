import java.util.*;
public class FeeCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fee=125000;
        int discountPercent=10;
        double discountAmt= (discountPercent/100.0)*fee;
<<<<<<< HEAD
        double discountedFee=fee-discountAmt;
=======
        double discountedfee=fee-discountAmt;
>>>>>>> 40613a822039b6e8916cc486156ba8ae447e7556
        System.out.println("The discount amount is INR+ "+discountAmt+" and the discounted fee is INR "+discountedFee);
    }
}
