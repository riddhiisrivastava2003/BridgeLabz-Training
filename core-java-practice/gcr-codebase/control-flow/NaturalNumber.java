import java.util.*;
public class NaturalNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number>0){
            int sum= number*(number+1)/2;
            System.out.println(" The  sum of the n natural numbers "+sum);

        }
        else{
            System.out.println("Not a Natural Number");
        }
    }
}