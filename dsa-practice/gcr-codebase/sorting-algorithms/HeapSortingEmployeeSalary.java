package sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSortingEmployeeSalary {
	
	public static void heapSortSalary(int[] arr) {
		int len=arr.length;
		
		for(int i=len/2-1;i>=0;i--) {
			heapify(arr,len,i);
		}
		
		for(int i=len-1;i>0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}
	
	
	public static void heapify(int[] arr,int n,int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		
		if(left<n && arr[left]>arr[largest]) 
			largest=left;
		
			
			
			if(right<n&&arr[right]>arr[largest]) 
				largest=right;
				
				if(largest !=i) {
					int temp=arr[i];
					arr[i]=arr[largest];
					arr[largest]=temp;
					
					heapify(arr,n,largest);
				}
				
			}
			
		
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of employees:");
		int n=sc.nextInt();
		
		int[] salaries=new int[n];
		
		System.out.println("enter the salaries of employees:");
		for(int i=0;i<n;i++) {
			salaries[i]=sc.nextInt();
		}
		
		heapSortSalary(salaries);
		System.out.println(Arrays.toString(salaries));
		
		
	}

}
