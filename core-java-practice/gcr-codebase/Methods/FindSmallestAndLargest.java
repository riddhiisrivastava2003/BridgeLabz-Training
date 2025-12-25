
import java.util.Scanner;
public class FindSmallestAndLargest {

	public static void findNumber(int a, int b, int c) {
		int smallest = a; 
		int largest = a;
	
		
		if(b<smallest) {
			smallest = b;
			
		}
		if(b>largest ) {
			largest = b;
		}

		if(c<smallest) {
			smallest = c;
			
		}
		if(c>largest) {
			largest = c;
		}
		System.out.println("Smallest  " + smallest);
		System.out.println("Largest " + largest);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number : ");

		int firstNum = sc.nextInt();
		
		System.out.println("enter second number: ");

		int secondNum = sc.nextInt();
		
		System.out.println("enter third number: ");

		int thirdNum = sc.nextInt();
		
		findNumber(firstNum , secondNum, thirdNum);

		
		

	}

}
