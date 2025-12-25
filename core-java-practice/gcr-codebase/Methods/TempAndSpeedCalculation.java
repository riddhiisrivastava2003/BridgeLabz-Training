import java.util.Scanner;
public class TempAndSpeedCalculation {

	
	public static double calculateWind(double temp , double speed) {

		double windChill = 35.74 +0.6215 * temp + ( 0.4275 * temp - 35.75) * Math.pow(speed,  0.16);
		return windChill;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature ");
		
		double temp = sc.nextDouble();
		
		System.out.println("Enter speed ");

		double speed = sc.nextDouble();

		double result = calculateWind(temp , speed);
		
		System.out.println("The wind chill temperature is:  " + result);
		
		sc.close();

	}

}
