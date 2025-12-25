import java.util.Scanner;

public class NumberChecker1 {
	public static int countingDigits(int n) {

		return String.valueOf(n).length();
	}
	

	public static int[] getDigit(int n) {
		int len = countDigit(n);
		int[] dig = new int[len];
		for(int i =len-1;i>=0;i--) {
			dig[i] = n%10;
			n/= 10;
			
		}
		return dig;
	}

	public static boolean isDuck(int[] d) {
		for(int x:d) {
			if(x!=0) 
				return true;
			}
		return false;
	}

	public static boolean isArmstrong(int n , int[] d) {
		int sum = 0, p = d.length;
		for(int x: d)
			 sum += Math.pow(x,p);
		return sum == n;
		
	}

	public static void largestTwo(int[] d) {
		int max = Integer.MIN_VALUE, m = Integer.MAX_VALUE;
		for(int x:d){
			if(x > max ){
				m = max; 
				max = x;
				
			}
			else if(x >m && x != max)
				 m = x;
			
		}System.out.println("Largest: " + max + ", Second Largest: " + m);
		
	}

	public static void smallestTwo(int[] d) {
		int min = Integer.MAX_VALUE , sm = Integer.MAX_VALUE;
		for(int x:d) {
			if(x<min) {
				sm = min; 
				min = x;
			}
			else if(x < sm && x!= min) 
				sm = x;
			
		
	}
		System.out.println("smallest: " + min + ", second Smallest: " + sm);
	}
	public static void main(String[] args) {
		int n = 153;
		int[] digit = getDigit(n);
		
		System.out.println("Digits count: " + countingDigits(n));
		System.out.println("Duck Number: " + isDuck(digit));
		System.out.println("Armstrong Number: "  + isArmstrong(n, digit));
		largestTwo(digit);
		smallestTwo(digit);

	}

}
