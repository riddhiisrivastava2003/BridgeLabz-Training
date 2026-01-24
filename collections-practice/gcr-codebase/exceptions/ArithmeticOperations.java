import java.util.*;

public class ArithmeticOperations{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.print("enter the first number:");
            int num1=sc.nextInt();
            System.out.print("enter the second number:");
            int num2=sc.nextInt();

            int result=num1/num2;
            System.out.println("result: "+result);
        }

        catch(ArithmeticException e){

            System.out.println("number cannot be divided by zero");

        }

        catch(InputMismatchException e){
            System.out.println("invalid input");
        }


        }
    }
