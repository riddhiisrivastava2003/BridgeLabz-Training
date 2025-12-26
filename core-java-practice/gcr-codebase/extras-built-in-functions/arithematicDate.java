import java.time.LocalDate;
import java.util.*;


public class arithematicDate{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter date (yyyy-mm-dd)");
        LocalDate date=LocalDate.parse(sc.next());

        LocalDate result=date.plusDays(7)
                                .plusMonths(1)
                                .plusYears(2)
                                .minusWeeks(3);


        System.out.println("date after calculation "+result);
    }
}
