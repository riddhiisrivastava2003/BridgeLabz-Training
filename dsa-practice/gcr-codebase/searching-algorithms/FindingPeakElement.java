 import java.util.*;

public class FindingPeakElement{

    public static int peakElement(int arr[]){

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=left+(right-left)/2;


            if(arr[mid]<arr[mid+1])
                {

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

        int index=peakElement(arr);

         System.out.print("the array is: ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("peak element index of the array: "+index+" with peak element: "+arr[index]);
        
    }



}