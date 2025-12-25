

import java.util.*;

public class VowelAndConsonantsCount {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String str=sc.nextLine().trim().toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='a' &&  ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u') {
					vowels++;
				}
				
				else {
					consonants++;
				}
			}
				
			}
		
		System.out.println("vowels "+vowels);
		System.out.println("Consonants "+consonants);
			
		}

}
