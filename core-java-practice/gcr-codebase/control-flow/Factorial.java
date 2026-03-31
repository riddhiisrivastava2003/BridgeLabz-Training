import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Negative Number");
        }

        int factorial=1;
        int i=1;
        while(i<=num){
            factorial=factorial*i;
            i++;

        }
        System.out.println("factorial "+factorial);
    }
}