import java.util.*;
public class HarshadNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int sum=0;
        int temp=number;

        while(temp!=0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;

        }
        if(number%sum==0) System.out.println("is a harshad number");
        else System.out.println("not a harshad number");
    }
}