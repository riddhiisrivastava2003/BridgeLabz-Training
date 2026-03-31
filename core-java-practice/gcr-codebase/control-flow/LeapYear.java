import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        int year=sc.nextInt();

        if(year<1582) System.out.println("Year must be greater than 1582");
        else if(year %4 !=0) System.out.print("Not a leap year");
        else if(year %100 !=0) System.out.println("Is a leap Year");
        else if(year %400==0) System.out.println("Is a Leap Year");
        else System.out.println("Not a leap year");
    }
}