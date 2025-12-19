import java.util.*;
public class ArmstrongNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int sum=0;
        int original=number;

        while(original !=0){
            int temp=original%10;
            sum=sum+temp*temp*temp;
            original=original/10;
        }
        if(sum==number) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}