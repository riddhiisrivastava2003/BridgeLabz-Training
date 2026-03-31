/*. Reverse Integer
Solved
Medium
Topics
premium lock icon
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
*/




import java.util.*;

public class ReverseInteger {
	
	public static int reverse(int x) {
		
		int rev=0;
		
		while(x!=0) {
			int lastDig=x%10;//getting last digit
			
			x=x/10;
			
			if(rev>Integer.MAX_VALUE/10 ||(rev==Integer.MAX_VALUE/10 && lastDig>7)) {
				return 0; //overflow happened
			}
			
			if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && lastDig<-8)) {
				return 0; //uderflow happened
			}
			
			rev=rev*10+lastDig;
			
		}
		return rev;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a 32 bit signed inetger");
		int x=sc.nextInt();
		
		int reversed=reverse(x);
		System.out.println("reversed integer "+reversed);
		
		
	}

}
