import java.util.*;
public class Calendar{

    public static String monthName(int month){
        String[] months={"january", "february","march","april","may","june","july","august","september","october","november","december"};
        return months[month-1];


    }

    public static boolean leapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }


    public static int daysInMonth(int month, int year){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapYear(year) && month==2){
            return 29;
        }

        return days[month-1];
    }


    public static int getDayFirst(int month, int year){
        int d=1;
        int y=year;
        int m=month;

        if(m<3){
            m=m+12;
            y--;
        }

        int i=y%100;
        int j=y/100;

        int day=(d+(13*(m+1))/5+i+(i/4)+(j/4)+(5*j))%7;
        return (day+6)%7;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter month");
        int month=sc.nextInt();
        System.out.println("enter year");
        int year=sc.nextInt();

        System.out.println("\n "+monthName(month)+" "+year);

        System.out.println("sun mon tues wed thurs fri sat");
        int daysInMonth= daysInMonth(month,year);
        int firstDay=getDayFirst(month,year);


        for(int i=0;i<firstDay;i++){
            System.out.print("   ");
        }

        for(int day=1;day<=daysInMonth;day++){
            System.out.printf("%4d",day);
            if((day+firstDay)%7 == 0){
                System.out.println();
            }
        }
    }


} 