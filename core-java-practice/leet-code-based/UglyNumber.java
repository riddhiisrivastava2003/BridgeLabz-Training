/*263. Ugly Number
Solved
Easy
Topics
premium lock icon
Companies
An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 

Constraints:

-231 <= n <= 231 - 1 */

import java.util.*;


public class UglyNumber {
	
	public static boolean isUgly(int n) {
		if (n<=0){
			return false;
			
		}
		
		int[] factors= {2,3,5};
		
		for(int i:factors) {
			while(n%i==0) {
				n=n/i;
			}
		}
		
		return n==1;
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(isUgly(n)) {
			System.out.println("number is ugly");
			
		}
		else {
			System.out.println("number is not ugly");
		}
	}

}
