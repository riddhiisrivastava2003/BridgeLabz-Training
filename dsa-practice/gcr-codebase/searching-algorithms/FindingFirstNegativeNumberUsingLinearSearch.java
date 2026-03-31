import java.util.*;
public class FindingFirstNegativeNumberUsingLinearSearch{

    public static int findingNegative(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                
                return i;
            }
           
        }
        return -1;
        


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // if(findingNegative(arr)==-1){
        //     System.out.println("no negative number found");
        //     return;
        // }
        

        System.out.println("index having first negative number: "+findingNegative(arr));
    }
    
    



    
}