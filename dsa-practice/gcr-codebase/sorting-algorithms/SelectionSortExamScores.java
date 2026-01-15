package sorting_algorithms;

import java.util.*;
public class SelectionSortExamScores {
	
	public static void selectionSortScores(int[] arr) {
		int len=arr.length;
		
		for(int i=0;i<len-1;i++) {
			int min=i;
			
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of students:");
		int n=sc.nextInt();
		
		int[] scores=new int[n];
		
		System.out.println("enter the scores:");
		for(int i=0;i<n;i++) {
			scores[i]=sc.nextInt();
		}
		
		selectionSortScores(scores);
		System.out.println(Arrays.toString(scores));
		
		
	}

}
