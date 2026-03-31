

import java.util.*;


public class SubstringComparison {
	
		static String substringCreation(String text,int start,int end) {
			String result="";
			
			for(int i=start;i<end;i++) {
				result =result+text.charAt(i);
			}
			return result;
		}
		
		static boolean compareString(String s1,String s2) {
			if(s1.length() !=s2.length()) 
				return false;
			
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i) !=s2.charAt(i) )
					return false;
			}
			return true;
			
		}
		
		
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the string ");
			
			String text=sc.next();
			
			System.out.println("enter the start index ");
			int start=sc.nextInt();
			
			System.out.println("enter the last index ");
			int end=sc.nextInt();
			
			String sub1=substringCreation(text,start,end);
			String sub2=text.substring(start,end);
			boolean result=compareString(sub1,sub2);
			
			System.out.println("substring using charAt() "+sub1);
			System.out.println("substring using substring() "+sub2);
			System.out.println("are the substrings same? "+result);
			
		}
		

}
