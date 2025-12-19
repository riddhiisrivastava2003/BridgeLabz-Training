import java.util.*;
public class CalculatorUsingSwitch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble(), num2=sc.nextDouble();

        String ch=sc.next();
        switch(ch){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1-num2);
                break;
            case "/":
                if(num2 !=0) System.out.println(num1/num2);
                else System.out.println("error");
                break;  
            default:
                System.out.println("Invalid Operator");
                break;      
        }

    }
}
