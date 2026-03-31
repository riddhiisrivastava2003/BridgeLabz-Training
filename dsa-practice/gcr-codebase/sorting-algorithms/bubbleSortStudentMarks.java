package sorting_algorithms;

import java.util.*;


public class bubbleSortStudentMarks {
	
	public static void bubbleSort(int[] arr) {
		
		int len=arr.length;
		
		boolean swapped;
		
		for(int i=0;i<len;i++) {
			swapped=false;
			
			for(int j=0;j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped =true;
				}
				
			}
			if(!swapped) break;
		}
	}

	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of students:");
		int n=sc.nextInt();
		
		int[] marks=new int[n];
		
		System.out.println("enter the marks:");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		
		bubbleSort(marks);
		System.out.println(Arrays.toString(marks));
		
		
	}
}
