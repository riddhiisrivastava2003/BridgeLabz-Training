import java.util.*;
public class NumberCheckerPerfect{

    public static int sumOfProperDivisors(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum=sum+i;
        }
        return sum;
    }

   public  static boolean perfectCheck(int num){
        return sumOfProperDivisors(num)==num;
    
    }

    public static boolean AbundantCheck(int num){



        
        return sumOfProperDivisors(num)>num;
    }

    public static boolean deficientCheck(int num){
        return sumOfProperDivisors(num)<num;

    }


    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        return fact;
    }


    public static boolean strongCheck(int num){
        int temp=num;
        int sum=0;

        while(temp>0){
            int digit=temp%10;
            sum=sum+factorial(digit);
            temp=temp/10;
        }

        return sum==num;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int num=sc.nextInt();

        System.out.println("perfect number check "+perfectCheck(num));
        System.out.println("abundant number check "+AbundantCheck(num));
        System.out.println("deficient number check "+deficientCheck(num));
        System.out.println("strong number check "+strongCheck(num));
    }


    
}

