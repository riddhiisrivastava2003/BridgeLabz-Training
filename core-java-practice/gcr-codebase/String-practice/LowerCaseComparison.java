

import java.util.*;
public class LowerCaseComparison {

	
	static String toLowerCaseUsingCharAt(String s) {
		String result="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				result=result+(char)(ch+32);
			}
			else {
				result=result+ch;
			}
		}
		return result;
		
		
	}
	static boolean stringComparison(String s1,String s2) {
		if(s1.length()!=s2.length())
			return  false;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) !=s2.charAt(i))
				return false;
		}
		return true;
		
		
		}
	     public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("enter");
		  String input=sc.nextLine();
		  
		  String lowerViaCharAt=toLowerCaseUsingCharAt(input);
		  String lowerViaBuiltIn=input.toLowerCase();
		  
		  boolean result=stringComparison(lowerViaCharAt,lowerViaBuiltIn);
		  
		  System.out.println("result by charAt "+lowerViaCharAt);
		  System.out.println("result by function "+lowerViaBuiltIn);
		  System.out.println("are both same?? "+result);
		  
		  
		  
	}
	
}
