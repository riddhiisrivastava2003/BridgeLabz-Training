package Extras;

import java.util.*;

public class ReverseString {
	
	public static String reverseString(String str) {
		String reversed=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reversed=reversed+str.charAt(i);
		}
		
		return reversed;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String str=sc.nextLine();
		
		String result=reverseString(str);
		
		System.out.println("reversed string is "+result);
	}

}
