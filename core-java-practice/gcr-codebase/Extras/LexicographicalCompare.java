package Extras;

import java.util.*;

public class LexicographicalCompare {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		
		System.out.println("the second string ");
		String s2=sc.nextLine();
		
		int i=0;
		
		while(i<s1.length() && i<s2.length()) {
			if(s1.charAt(i) !=s2.charAt(i)) {
				System.out.println("\"" +s1+"\""+(s1.charAt(i)<s2.charAt(i)? "comes before ":" comes after")+"\"" +s2+"\" in lexicographical order");
				return;
			}
			i++;
		}
		
		if(s1.length()==s2.length())
			{System.out.println("both string are equal");}
		
		else{
			
			System.out.println("\"" +s1+"\"" +(s1.length()<s2.length()? "comes before ":"comes after")+"\"" +s2+"\" in lexicographical order");
			
		}
		
	}

}
