import java.util.*;
public class FactorialUsingRecursion{

    public static int factorial(int num){
        if(num==0 || num==1) return 1;

        return num*factorial(num-1);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter ");
        int num=sc.nextInt();

        System.out.println("the factorial is "+factorial(num));
    }
}