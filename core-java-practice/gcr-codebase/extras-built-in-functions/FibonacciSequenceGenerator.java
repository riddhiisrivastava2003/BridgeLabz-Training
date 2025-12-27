import java.util.*;
public class FibonacciSequenceGenerator{
    public static void printFibonacci(int num){
        int a=0;
        int b=1;

        System.out.println("fibonacci sequence ");
        for(int i=1;i<=num;i++){
            System.out.println(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the limit");
        int num=sc.nextInt();

        printFibonacci(num);
        

    }
}