package Extras;

import java.util.*;


public class PalindromStringProgram {
	
	public static boolean palindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start) !=str.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		boolean result=palindrome(str);
		
		if(result) System.out.println("the string is palindrome");
		else System.out.println("the string is not palindrome");
	}

}
