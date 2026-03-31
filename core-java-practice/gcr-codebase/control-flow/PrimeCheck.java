import java.util.*;
public class PrimeCheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
        if(number<=1) System.out.println("Not prime");
        else {
            boolean isPrime=true;

            for(int i=2;i<number;i++){
                if(number%i==0) {isPrime=false;
                    break;
                }
                
            }
            if(isPrime) System.out.println("Is a prime number");
            else System.out.println("Not a prime number");
        }
    }
}