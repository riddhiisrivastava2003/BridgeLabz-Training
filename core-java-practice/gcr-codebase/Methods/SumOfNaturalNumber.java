import java.util.Scanner;
public class SumOfNaturalNumber {	
	public static int calculateSum(int num) {
		int sum = 0 ;
		for(int i = 1; i<= num ; i++) {
			sum = sum + i;	
		}return sum;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int number = sc.nextInt();
	
		int sum = calculateSum(number);
	
		System.out.println("The sum of " + number + " Natural number is: " + sum);
		sc.close();
	}
	

}
