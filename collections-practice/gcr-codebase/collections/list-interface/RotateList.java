import java.util.*;

public class RotateList{

    static void reverse(int[] arr,int start,int end){
        while(start<end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.println("enter number of elements ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }


        System.out.print("rotate by positions: ");
        int pos=sc.nextInt();

        pos=pos%n;

        reverse(arr,0,pos-1);
        reverse(arr,pos,n-1);
        reverse(arr,0,n-1);

        System.out.println("rotated array");
        System.out.println(Arrays.toString(arr));
    }
}