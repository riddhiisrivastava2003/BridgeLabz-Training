import java.util.Scanner;
public class CalculateAthleteRounds {
	public static double calculateRounds(double first, double second, double third) {
		double perimeter = first+ second + third ;
		double distance = 5000;
		return distance / perimeter;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first side  ");
		double first = sc.nextDouble();
		System.out.println("Enter second side  ");
		double second = sc.nextDouble();
		System.out.println("Enter third side ");
		double third = sc.nextDouble();
		
		double athleteRounds = calculateRounds(first , second , third);
		
		System.out.println("The athlete needs to complete " + athleteRounds + " rounds to finish a 5km run. ");
		

	}

}
