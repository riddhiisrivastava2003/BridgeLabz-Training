import java.util.Scanner;

public class PrintQuotientAndRemainder {

	
	public static int[] remainderAndQuotient(int number , int divisor) {

		int quotient = number / divisor ;

		int remainder = number %  divisor;

		return new int[] {quotient , remainder};
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the divisor : ");
		int divisor = sc.nextInt();
		
		int[] result = remainderAndQuotient(number , divisor);
		
		System.out.println("quotient  " + result[0]);

		
		System.out.println("remainder  " + result[1]);

	

	}

}
