import java.util.*;
public class TemperatureConversion{
    public static double celciusToFarhenheit(double celcius){
        return(celcius*9/5)+32;
    }

    public static double fahrenheitToCelcius(double fahrenheit){
        return(fahrenheit-32)*5/9;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your choice");
        System.out.println("enter 1 for celcius to farhenheit");
        System.out.println("enter 2 for farhenheit to celcius");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("enter the temperature in celcius");
                double celcius=sc.nextDouble();
                System.out.println(celciusToFarhenheit(celcius)+" farhenheit");
                break;
            case 2:
                System.out.println("enter the temperature in farhenheit");
                double   farhenheit=sc.nextDouble();
                System.out.println(fahrenheitToCelcius(farhenheit)+" celcius");
                break;
            default:
                System.out.println("invalid choice");      
        }
    }
}