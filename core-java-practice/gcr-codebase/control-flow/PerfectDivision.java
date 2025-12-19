import java.util.*;
public class PerfectDivision{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();

         if(number <=1 || number >=100){
            System.out.println("Invalid Input");

         }
         else{
            for(int i=100;i>=1;i--){
                if(number%i==0){
                    System.out.println(i);
                    
                }
            }
            
         }
    }
}