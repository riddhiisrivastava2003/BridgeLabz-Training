import java.util.Scanner;
public class SimpleInterestCalculation {


	
	public static double simpleInterest(int principal , double rate , int time) {

		double simpleInterest = (principal * rate * time)/100;
		return simpleInterest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		int principal = sc.nextInt();
		
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time: ");
		int time = sc.nextInt();

		double interest = simpleInterest(principal , rate , time);
		
		System.out.println("The Simple interest is " + interest );
		
		sc.close();
		
		
		
		

	}

}
