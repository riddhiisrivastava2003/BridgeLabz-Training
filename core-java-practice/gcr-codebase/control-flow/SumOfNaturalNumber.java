import java.util.*;
public class SumOfNaturalNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();

        if(num<=0){
            System.out.println("Not a natural number");
        }

        int sumLoop=0;
        int i=1;
        while(i<=num){
            sumLoop +=i;
            i++;
        }
        int sumFormula= num*(num+1)/2;

        System.out.println("Using Loop"+sumLoop);
        System.out.println("Using Formula"+sumFormula);

        if(sumLoop==sumFormula){
            System.out.println("Both are correct");
        }
        else{
            System.out.println("Not correct");
        }
    }
    
}
