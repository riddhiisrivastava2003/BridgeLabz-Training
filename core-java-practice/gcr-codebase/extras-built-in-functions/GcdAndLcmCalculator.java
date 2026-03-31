import java.util.*;
public class GcdAndLcmCalculator{

    public static int gcd(int first,int second){
        while(second !=0){
            int temp=second;
            second=first%second;
            first=temp;

        }
        return first;
    }

    public static int lcm(int first, int second){
        return (first*second)/gcd(first,second);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number");
        int first=sc.nextInt();
        System.out.println("enter the second number");
        int second=sc.nextInt();

        System.out.println("gcd is "+gcd(first,second));
        System.out.println("lcm is "+lcm(first,second));
    }
}