import java.util.*;

public class FirstAndLastOccurrence{


    public static int firstOccurence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                result=mid;
                high=mid-1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;

    }

     public static int lastOccurence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                result=mid;
                low=mid+1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.println("enter size of the array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("enter target: ");
        int target=sc.nextInt();

        System.out.println("the first occurence: "+firstOccurence(arr,target));
        System.out.println("the last occurence: "+lastOccurence(arr,target));

    }
}