import java.util.*;
public class PerfectDivisionUsingWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
 int counter=100;
         if(number <=1 || number >=100){
            System.out.println("Invalid Input");

         }
        
         else{
            while(counter>1){
                if(number%counter==0){
                    System.out.println(counter);
                    
                }
                counter--;
            }
            
         }
    }
}