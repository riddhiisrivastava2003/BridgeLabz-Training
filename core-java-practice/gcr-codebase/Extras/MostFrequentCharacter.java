package Extras;

import java.util.*;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=sc.nextLine();
		
		int count=0;
		
		char character=str.charAt(0);
		
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			
			if(c>count) {
				count=c;
				character=str.charAt(i);
			}
		}
		System.out.println("most frequent character "+character);
	}
}
