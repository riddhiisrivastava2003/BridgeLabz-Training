
import java.util.*;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	static void generateException(String[] name) {
		System.out.println(name[name.length]);
	}
	
	static void handleException(String[] names) {
		try {
			System.out.println(names[names.length]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of names");
		int n=sc.nextInt();
		
		String[] names=new String[n];
		
		System.out.println("enter the name");
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
	
	handleException(names);

}
}
