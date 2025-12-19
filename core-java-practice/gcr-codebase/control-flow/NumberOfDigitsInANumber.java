import java.util.*;
public class NumberOfDigitsInANumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int count=0;
        int temp=number;

        if(temp<0) temp=-temp;

        if(temp==0) count=1;
        else{
            while(temp !=0){
                temp=temp/10;
                count++;
            }

        }
        System.out.println("Number of Digits in "+number+" are "+count);
    }
}