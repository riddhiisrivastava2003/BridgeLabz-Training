import java.util.*;
public class AreaOfTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         double base=sc.nextDouble();
         double height=sc.nextDouble();
         double areaInInches= 0.5*base*height;

         double areaInSquareCm=areaInInches*6.45;
         System.out.println("The area of traingle in square cm is  "+areaInSquareCm+" and inches is "+areaInInches);
    }
}