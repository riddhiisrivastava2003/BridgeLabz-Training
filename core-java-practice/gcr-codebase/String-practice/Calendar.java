import java.util.*;
public class Calendar{
    static String monthName(int m){
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return month[m-1];
    }

    static boolean isLeapYear(int y){
        return (y%400==0)||(y%4==0 && y%100 !=0);

    } 

    static int getDaysInMonth(int m,int y){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeapYear(y)) return 29;
    return days[m-1];
    }

    static int getFirstDay(int m,int y){
        int day=1;
        int yo=y-(14-m)/12;
        int x=yo+yo/4-yo/100+yo/400;
        int mo=m+12*((14-m)/12)-2;
        return(day+x+31*mo/12)%7;
    }
    static void display(int m,int y){
        System.out.println(monthName(m)+" "+y);
        System.out.println("sun mon tue wed thurs fri sat ");

        int first=getFirstDay(m, y);
        int days=getDaysInMonth(m, y);

        for(int i=0;i<first;i++)
            System.out.println("  ");
        for(int j=1;j<=days;j++){
            System.out.printf("%3d ",j);
            if((j+first)%7==0) System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month and year");
        int m=sc.nextInt();
        int y=sc.nextInt();
        display(m, y);
    }

}
