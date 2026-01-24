import java.util.*;

public class ArrayException{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("enter size: ");
            int size=sc.nextInt();

            int arr[]=new int[size];

            System.out.println("enter elements: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }


            System.out.println("enter index: ");
            int index=sc.nextInt();

            System.out.println("value at index "+index+" is "+arr[index]);


        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index ");
        }

        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
            }

       
    }
}