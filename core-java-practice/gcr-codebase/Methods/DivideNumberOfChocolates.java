
import java.util.Scanner;

public class DivideNumberOfChocolates {
	
	public static int[] divide(int chocolates, int children ) {
		int chocolatePerChild = chocolates / children ;

		int remaining = chocolates % children;
		
		return new int[] {chocolatePerChild , remaining};
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter chocolates ");
		int chocolates = sc.nextInt();
		
		System.out.println("enter Children ");
		int children = sc.nextInt();
		

		int[] result = divide(chocolates, children);
		
		System.out.println("chocolates per child " + result[0] );

		System.out.println("remaining chocolates = " + result[1]);
	

	}

}
