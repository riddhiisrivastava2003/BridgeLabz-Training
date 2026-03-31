
import java.util.*;
class NaturalNumberSumUsingLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
         if(number<=0){
            System.out.println("Not a natural number");
         }

         int sumFor=0;
         for(int i=0;i<=number;i++){
            sumFor=sumFor+i;
         }

         int sumFormula=number*(number+1)/2;

         System.out.println("Using Loop "+sumFor);
         System.out.println("Using Formula "+sumFormula);
    }
}