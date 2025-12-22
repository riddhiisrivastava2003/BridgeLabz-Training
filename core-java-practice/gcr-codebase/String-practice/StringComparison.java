/**
 * 
 */

import java.util.*;


/**
 * 
 */
public class StringComparison {
	
	static boolean compare(String a,String b ) {
		if(a.length() !=b.length()) 
			return false;
			
			
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i) !=b.charAt(i)) 
					return false;
				
			}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String first=sc.nextLine();
		
		System.out.println("Enter the second string");
		String second=sc.nextLine();
		
		boolean result1=compare(first,second);
		boolean result2=first.equals(second);
		
		System.out.println("result of chaAt "+result1);
		System.out.println("result of equals "+result2);
	}
	

}
