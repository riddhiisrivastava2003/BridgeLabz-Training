package Extras;

import java.util.*;

public class ReplaceAWordInASentence {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter sentence ");
		String sentence=sc.nextLine();
		
		System.out.println("enter word to replace");
		String old=sc.nextLine();
		
		System.out.println("enter new word");
		String newWord=sc.nextLine();
		
		String result=sentence.replace(old,newWord);
		
		System.out.println("replaced sentence "+result);
		
		
	}

}
