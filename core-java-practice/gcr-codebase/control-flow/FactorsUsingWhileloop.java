import java.util.*;
public class FactorsUsingWhileloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int i=1;
        System.out.println("Factors of "+num+" are:");
         while(i<num){
            if(num%i==0) System.out.println(i);
            i++;
         }
    }
}