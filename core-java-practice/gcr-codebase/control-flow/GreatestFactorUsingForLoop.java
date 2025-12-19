import java.util.*;
public class GreatestFactorUsingForLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int greatest=1;

        for(int i=number-1;i>=1;i--){
            if(number%i==0){
                greatest=i;
                break;
            }
        }
        System.out.println("Greatest factor except itself is "+greatest);
    }
}