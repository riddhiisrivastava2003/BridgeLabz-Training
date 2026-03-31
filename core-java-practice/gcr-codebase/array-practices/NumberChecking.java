import java.util.*;
public class NumberChecking{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int[] numbers=new int[5];
         System.out.println("Enter");
         for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
         }
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0) System.out.println("The number is zero");
            else if (numbers[i]<0) System.out.println(numbers[i]+" is negative");
            else if (numbers[i]>0){
                System.out.println(numbers[i]+" is positive");
                if(numbers[i]%2==0) System.out.println(numbers[i]+" is even");
                else System.out.println(numbers[i]+" is odd");
            }
            else System.out.println("Invalid Input");

            
         }
         int firstElement=numbers[0];
            int lastElement=numbers[numbers.length-1];

            if(firstElement==lastElement) System.out.println("The first element is equal to the last element");
            else if(firstElement>lastElement) System.out.println("The first element is less than last element");
            else System.out.println("The first element is less than last element");
    }
    
}