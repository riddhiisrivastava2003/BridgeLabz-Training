import java.util.*;

public class FindingRotationPoint{


    public static int rotionPoint(int arr[]){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid]>arr[right]){
                left=mid+1;
            }

            else{
                right=mid;
            }

        }
        return left;


    }
    

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index=rotionPoint(arr);

         System.out.print("the array is: ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("rotation point of the array: "+index+" with smallest element: "+arr[index]);
        
    }



}