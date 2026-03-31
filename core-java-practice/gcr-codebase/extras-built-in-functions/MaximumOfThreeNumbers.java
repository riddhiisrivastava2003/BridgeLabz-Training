import java.util.*;
public class MaximumOfThreeNumbers{

    public static int takingInput(Scanner sc){
        return sc.nextInt();
    }

    public static int findingMaximum(int a,int b,int c){
        int max=a;

        if(b>max) max=b;
        if(c>max) max=c;

        return max;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.println("enter the first number");
        int num1=takingInput(sc);

        System.out.println("enter the second number ");
        int num2=takingInput(sc);

        System.out.println("enter the third number");
        int num3=takingInput(sc);


        int max=findingMaximum(num1,num2,num3);
        System.out.println("maximum number is "+max);
    }
}