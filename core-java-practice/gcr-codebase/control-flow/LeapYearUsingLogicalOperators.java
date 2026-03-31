import java.util.*;
public class LeapYearUsingLogicalOperators{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        int year=sc.nextInt();

       if(year>=1582 &&(year %4==0 &&(year%100 !=0 ||  year %400==0))){
        System.out.println("Is a leap Year");
       }
       else if (year>=1582) System.out.println("Is not a Leap Year");
       else System.out.println("Year must be above 1582");
    }
}