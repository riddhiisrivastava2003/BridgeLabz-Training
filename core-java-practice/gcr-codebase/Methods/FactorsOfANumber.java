

import java.util.*;

public class FactorsOfANumber {

	static int[] findingFactors(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
			
			if(n%i==0) {
				count++;
			}
		
		int factor[]=new int[count];
		
		int id=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factor[id++]=i;
				
			}
		}
		return factor;
	}
	
	static int summation(int[] array) {
		int sum=0;
		for(int i:array) {
			sum=sum+i;
		}
		return sum;
	}
	
	static long product(int[] arr) {
		long prod=1;
		for(int i:arr) {
			prod=prod*i;
		}
		return prod;
	}
	
	static double squareSum(int[] arr) {
		double sum=0;
		for(int i:arr) {
			sum=sum+Math.pow(i, 2);
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter");
		int num=sc.nextInt();
		
		int[] factors=findingFactors(num);
		
		System.out.println("the factors are");
		for(int i:factors) {
			System.out.println(i+" ");
			
			
		}
		
		System.out.println("the sum is "+summation(factors));
		System.out.println("the product is "+product(factors));
		System.out.println("the sum of squares "+squareSum(factors));
	}
	
}
