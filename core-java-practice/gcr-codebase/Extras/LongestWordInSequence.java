package Extras;

import java.util.*;

public class LongestWordInSequence {

	public static String longestWord(String str) {
		String[] word=str.split(" ");
		String longest=" ";
		
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>longest.length()) {
				longest=word[i];
			}
		}
		
		return longest;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence");
		
		String str=sc.nextLine();

		String result=longestWord(str);
		
		System.out.println("longest word "+result);
		
	}
}
