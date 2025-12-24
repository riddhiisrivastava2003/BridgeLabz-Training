

import java.util.*;

public class NumberChecker {
	
	public static boolean isPositive(int num) {
		
		return num>=0;
		
	}
	
	public static boolean isEven(int num) {
		return num%2==0;
	}
	
	public static int comparison(int first,int second) {
		if(first>second)
			return 1;
		else if (first==second) return 0;
		else return -1;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		
		int[] numbers=new int[5];
		
		System.out.println("enter the numbers");
		for(int i=0;i<5;i++) {
			numbers[i]=sc.nextInt();
			
		}
		
		int greater=comparison(numbers[0],numbers[numbers.length-1]);
		
		for(int i=0;i<numbers.length;i++) {
			if(isPositive(numbers[i])) {
				if(isEven(numbers[i])) {
					System.out.println(numbers[i]+" is positive and even");
					
				}
				else {System.out.println(numbers[i]+" is positive and odd");}
			}
			else {
				System.out.println(numbers[i]+" is negative");
			}
			
			
			
		}
		if(greater==1) {
			System.out.println("first element is greater than the last ");
		}
		else if(greater==0) {
			System.out.println("first and last element are equal");
		}
		
		else {
			System.out.println("the last element is greater than the first");
		}
		
		
		
	}

}
