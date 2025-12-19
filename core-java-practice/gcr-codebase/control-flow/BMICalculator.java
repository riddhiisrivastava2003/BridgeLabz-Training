import java.util.*;
public class BMICalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        double weight=sc.nextDouble();
        double height=sc.nextDouble();

        double heightMeter=height/100;

        double bmi=weight/(heightMeter*heightMeter);

        if(bmi<=18.4) System.out.println("Underweight");
        if(bmi>=18.5 && bmi<=24.9) System.out.println("Normal");
        if(bmi>=25.0 && bmi <=39.9) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}