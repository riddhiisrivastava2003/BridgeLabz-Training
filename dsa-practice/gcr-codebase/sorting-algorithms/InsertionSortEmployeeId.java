package sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortEmployeeId {
	
	public static void insertionSortEmployee(int[] id) {
		int len=id.length;
		for(int i=1;i<len;i++) {
			
			int key=id[i];
			
			int j=i-1;
			
			while(j>=0 && id[j]>key) {
				id[j+1]=id[j];
				j--;
			}
			id[j+1]=key;
			
		}
		
		
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of employees:");
		int n=sc.nextInt();
		
		int[] employeeIds=new int[n];
		
		System.out.println("enter the id of employees:");
		for(int i=0;i<n;i++) {
			employeeIds[i]=sc.nextInt();
		}
		
		insertionSortEmployee(employeeIds);
		System.out.println(Arrays.toString(employeeIds));
		
		
	}

}
