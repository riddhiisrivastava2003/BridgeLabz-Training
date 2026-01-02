
import java.util.*;

public class ReverseString {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string ");
		String text=sc.nextLine();
		
		
		String rev="";
		
		for(int i=text.length()-1;i>=0;i--) {
			rev=rev+text.charAt(i);
			
		}
		
		System.out.println("reversed string "+rev);
	
	}

}
