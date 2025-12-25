package Extras;

import java.util.*;


public class SubstringOccurence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		System.out.println("enter substring");
		String substring=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<str.length()-substring.length();i++) {
			if(str.substring(i,i+substring.length()).equals(substring)) {
				count++;
			}
		}
		
		System.out.println("the substring occurence "+count);
	}

}
