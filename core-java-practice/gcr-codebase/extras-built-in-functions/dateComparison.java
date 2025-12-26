import java.time.LocalDate;
import java.util.*;

public class dateComparison{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first date(yyyy-mm-dd)");
        LocalDate date1=LocalDate.parse(sc.nextLine());

        System.out.println("enter the second date(yyyy-mm-dd)");
        LocalDate date2=LocalDate.parse(sc.nextLine());

        if (date1.isBefore(date2)){
            System.out.println("first date is before second date");
        }
        else if(date1.isAfter(date2)){
            System.out.println("first date is after second date");
        }

        else{
            System.out.println("both dates are equal");
        }
        }


    }

