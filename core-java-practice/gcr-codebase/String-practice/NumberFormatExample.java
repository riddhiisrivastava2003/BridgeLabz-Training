

import java.util.*;

public class NumberFormatExample {
	
	static void generateException(String text) {
		int num=Integer.parseInt(text);
		System.out.println("number: "+num);
	}
	
	static void handleException(String text) {
		try {
			int num=Integer.parseInt(text);
			System.out.println("number "+num);
		}
		catch (NumberFormatException e){
			System.out.println("NumberFormatException ");
			
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value ");
		String text=sc.next();
		
		handleException(text);
	}

}
