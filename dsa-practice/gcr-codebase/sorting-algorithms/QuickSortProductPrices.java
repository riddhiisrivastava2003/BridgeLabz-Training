package sorting_algorithms;

import java.util.*;


public class QuickSortProductPrices {
	
	public static void quickSortPrices(int arr[],int low,int high) {
		
		if(low<high) {
			int p=partition(arr,low,high);
			quickSortPrices(arr,low,p-1);
			quickSortPrices(arr,p+1,high);
			
		}
		
	}
	
	private static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of products:");
		int n=sc.nextInt();
		
		int[] products=new int[n];
		
		System.out.println("enter the prices:");
		for(int i=0;i<n;i++) {
			products[i]=sc.nextInt();
		}
		
		quickSortPrices(products,0,products.length-1);
		System.out.println(Arrays.toString(products));
		
		
	}

}
