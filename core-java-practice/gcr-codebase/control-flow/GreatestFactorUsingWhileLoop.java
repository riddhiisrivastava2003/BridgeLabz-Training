import java.util.*;
public class GreatestFactorUsingWhileLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int greatestFact=1;
        int counter=number-1;

        while(counter>=1){
            if(number%counter==0){
                greatestFact=counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor except itself is "+greatestFact);
    }
}