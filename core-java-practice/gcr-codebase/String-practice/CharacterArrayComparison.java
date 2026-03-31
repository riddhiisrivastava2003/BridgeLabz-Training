
import java.util.*;

public class CharacterArrayComparison {
	static char[] getCharacters(String text) {
		char[] arr=new char[text.length()];
		
		for(int i=0;i<text.length();i++) {
			arr[i]=text.charAt(i);
		}
		return arr;
	}
	
	static boolean arrayComparison(char[]a ,char[] b) {
		if(a.length !=b.length) 
			return false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] !=b[i])
				return false;
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");
		String text=sc.next();
		
		char[] arr1=getCharacters(text);
		char[] arr2=text.toCharArray();
		
		boolean result=arrayComparison(arr1,arr2);
		
		System.out.println("the characters using defined methods");
		for(char c:arr1) {
			System.out.print(c+" ");
		}
		
		System.out.println("the characters using toCharArray()");
		for(char c: arr2) {
			System.out.print(c+" ");
		}
		
		System.out.println("are the character arrays same? "+result);
		
		
		
	
	}

}
