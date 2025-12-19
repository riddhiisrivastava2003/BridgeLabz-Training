import java.util.*;
public class FeeDiscount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discountPercent=sc.nextDouble();
        double discount=(discountPercent/100)*fee;
        double discountedFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+ "and the discunted fee is INR "+discountedFee);
    }
}
