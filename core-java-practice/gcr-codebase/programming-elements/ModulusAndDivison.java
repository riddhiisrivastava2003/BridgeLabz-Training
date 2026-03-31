import java.util.*;
public class ModulusAndDivision{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int quotient=number1/number2;
        int remainder=number1%number2;
        System.out.println("The quotient is "+quotient+" and the remainder is "+ remainder+ " of two numbers "+number1+" and "+number2);
    }
}