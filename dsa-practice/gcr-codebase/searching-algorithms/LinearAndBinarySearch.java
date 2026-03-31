import java.util.*;

public class LinearAndBinarySearch{

    public static int firstMissingPositive(int[] arr){
        int n=arr.length;

        boolean[] present=new boolean[n+2];

        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<=n){
                present[arr[i]]=true;
            }
        }


        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
    
            }
        }

        return -1;




    }



    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if (arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    

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

         int missing=firstMissingPositive(arr);
        System.out.println("the missing number is: "+missing);

        System.out.println("enter target: ");
        int target=sc.nextInt();

        Arrays.sort(arr);
        System.out.println("the array is: "+Arrays.toString(arr));

        int index=binarySearch(arr,target); 

        if(index==-1){
            System.out.println("target not found");
        }   
        else{
            System.out.println("target found at index: "+index);
        
        }


    }
}