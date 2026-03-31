

import java.util.*;
public class PalindromeCheck {
	
	String text;
	
	public boolean palindrome() {
		
		String newText=text.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int start=0;
		int end=newText.length()-1;
		
		while(start<end) {
			if(newText.charAt(start) !=newText.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		return true;
		
				
		
	}
	
	public void display() {
		if(palindrome()) System.out.println("the text is palindrome");
		else System.out.println("the text is not palindrome");
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		 
		PalindromeCheck check=new PalindromeCheck();
		
		System.out.println("enter the text ");
		check.text=sc.nextLine();
		
		check.display();
	}

}
