

import java.util.*;

public class UpperCaseCompare {
	
	static String toUpperUsingCharAt(String text) {
		String result="";
		
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(ch>='a' && ch<='z') {
				result =result+(char)(ch-32);
			}
			else {
				result = result+ch;
			}
		}
		return result;
	}

	static boolean compareStrings(String s1,String s2) {
		if(s1.length() !=s2.length()) { return false;}
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) !=s2.charAt(i)) 
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter ");
		String first=sc.nextLine();
		
		String upperCase=toUpperUsingCharAt(first);
		String builtInUpperCase=first.toUpperCase();
		boolean result=compareStrings(upperCase,builtInUpperCase);
		 System.out.println("Upper case via charAt function "+upperCase);
		 System.out.println("UpperCase via toUpperCase "+builtInUpperCase);
		 System.out.println("Are both the result same?? "+result);
		
		
		
		
	}
}
