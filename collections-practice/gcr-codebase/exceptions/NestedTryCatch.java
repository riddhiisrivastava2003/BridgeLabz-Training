import java.util.*;

public class NestedTryCatch{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.print("enter size: ");
        int size=sc.nextInt();


        int[] arr=new int[size];

        System.out.println("enter elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("enter index: ");
        int index=sc.nextInt();


        System.out.print("enter divisor: ");
        int divisor=sc.nextInt();

        try{
            try{
                int value=arr[index];

                try{
                    int result=value/divisor;

                    System.out.println("result: "+result);
                }
                catch(ArithmeticException e){
                    System.out.println("cannot divide by zero");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("invalid array index");
            }
            
        }
        finally{
            sc.close();
        }
    }
}