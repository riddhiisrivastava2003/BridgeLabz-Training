import java.util.*;
public class HeightConversion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double inches= height/2.54;
        int feet=(int)(inches/12);
        double totalInches=inches%12;
        System.out.println("Your height in cm is "+height+" while in feet is "+feet+" and inches is "+totalInches);

    }
}