import java.util.*;

public class  BusRouteDistanceTracker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int totalDistanceCovered=0;

        System.out.println("enter the distance covered per stop");
        int distance=sc.nextInt();

        System.out.println("enter the total number of stops ");
        int stops=sc.nextInt();

        int current=1;
        char choice='n';

        while(current<=stops && choice !='y'){

            totalDistanceCovered +=distance;
            System.out.println("stop reached "+current);
            System.out.println("distance covered till now "+totalDistanceCovered);
            System.out.println("do you want to get off..enter choice(y/n) ");
            choice=sc.next().toLowerCase().charAt(0);

            current++;
        }

        System.out.println("Thanks for travelling with us...your total distance covered is "+totalDistanceCovered);

    }
}