
import java.util.*;


public class StringIndexOutOfBoundExample {
	
	static void generateException(String text) {
		System.out.println(text.charAt(text.length()));
	}
	
	static void handleException(String text) {
		try {
			System.out.println(text.charAt(text.length()));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringOutOfBoundsException");
			
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string ");
		String text=sc.next();
		
		handleException(text);
	}

}
