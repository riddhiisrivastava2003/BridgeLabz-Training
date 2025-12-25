package Extras;

import java.util.*;


public class RemoveASpecificCharacterFromAString {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string ");
		String str=sc.nextLine();
		
		System.out.println("enter character to remove ");
		char remove=sc.next().charAt(0);
		
		String result="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=remove) {
				result +=str.charAt(i);
			}
		}
		
		System.out.println("modified string "+result);
	}

}
