import java.lang.reflect.Method;
import java.util.Scanner;
public class DynamicallyInvokingMethods {
    static class MathOperations{
        public int add(int a , int b ){
            return  a+b;
        }
        public int subtract(int a , int b){
            return a-b;
        }
        public int multiply(int a, int b){
            return a*b;

        }
        }
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter method name : ");
            String name = sc.next();

            MathOperations obj = new MathOperations();
            Method method = MathOperations.class.getMethod(name, int.class, int.class);

            System.out.println("Result = " + method.invoke(obj, 20, 5));

            
        }
    }
 

