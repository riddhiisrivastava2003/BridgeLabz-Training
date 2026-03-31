import java.util.*;


public class StringLengthWithoutUsingMethod {
	
	static int length(String text) {
		int count=0;
		
		try {
			while(true) {
				text.charAt(count);
				count++;
			}
		}catch(Exception e) {
				
			}
		
			
		
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter");
		String text=sc.next();
		
		int len=length(text);
		
		int builtInLen=text.length();
		
		System.out.println("length using userdefine "+len);
		System.out.println("length using length() "+builtInLen);
		
	}

}
