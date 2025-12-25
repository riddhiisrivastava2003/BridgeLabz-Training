package Extras;

import java.util.*;

public class CheckIfTwoStringsAreAnagrams {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first ");
		String s1=sc.nextLine();
		
		System.out.println("enter second ");
		String s2=sc.nextLine();
		
		if(s1.length() !=s2.length()) {
			System.out.println("Not anagrams");
			return;
			
		}
		int[] count=new int[256];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				System.out.println("not anagrams");
				return;
			}
		}
		
		System.out.println("Strings are anagrams");
		
	}

}
