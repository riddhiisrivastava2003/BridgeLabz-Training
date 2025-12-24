

import java.util.*;


public class SumOfNaturalNumbers {
	
	public static int sumByRecursion(int num) {
		if(num==0) return 0;
		
		return num+sumByRecursion(num-1);
	}
	
	public static int sumByFormula(int num) {
		return num*(num+1)/2;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int num=sc.nextInt();
		
		if(num<=0) {System.out.println("the number is not natural");
		return;
		}
		
		int sumByRec=sumByRecursion(num);
		int sumByFor=sumByFormula(num);
		
		
		System.out.println("the sum using recursion is "+sumByRec+" and the sum using formula is "+sumByFor);
		System.out.println();
		
		if(sumByRec==sumByFor) {
			System.out.println("the results are equal");
			
		}
		else {
			System.out.println("the results are not equal");
		}
		
		
		
		
	}

}
