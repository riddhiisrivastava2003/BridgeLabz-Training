import java.util.*;
public class BasicCalculator{
    public static double add(double first, double second){
        return first+second;
    }

    public static double subtract(double first,double second){
        return first-second;
    }

    public static double multiply(double first,double second){
        return  first*second;
    }

    public static double divide(double first,double second){
        if(second==0) {
            System.out.println("Cannot divide by zero");
        }
        return first/second;
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number");
        double first=sc.nextDouble();

        System.out.println("enter the second number");
        double second=sc.nextDouble();

        System.out.println("enter choice ");
        System.out.println("enter 1 for addition");
        System.out.println("enter 2 for subtraction");
        System.out.println("enter 1 for multiplication");
        System.out.println("enter 1 for division");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println(add(first,second));
                break;
            case 2:
                System.out.println(subtract(first,second));
                break;
            case 3:
                System.out.println(multiply(first,second));
                break;
            case 4:
                System.out.println(divide(first,second));
                break;
            default:
                System.out.println("invalid choice");
                break;                
        }
    
    }

}