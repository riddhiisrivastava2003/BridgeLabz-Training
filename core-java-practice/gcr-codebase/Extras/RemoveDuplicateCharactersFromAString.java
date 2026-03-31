package Extras;

import java.util.*;


public class RemoveDuplicateCharactersFromAString {
	
	public static String removingDuplicates(String str) {
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			
			if(result.indexOf(current)==-1) {
				result=result+current;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		
		String str=sc.nextLine();
		
		String result=removingDuplicates(str);
		
		System.out.println("string after duplicate removal "+result);
	}

}
