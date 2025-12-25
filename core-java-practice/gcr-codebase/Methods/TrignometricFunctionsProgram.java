import java.util.Scanner;
public class TrignometricFunctionsProgram {
	
	public static double[] calculate(double angle) 
	
	{

		double rad = Math.toRadians(angle);
		
		double sin = Math.sin(rad);
		double cos = Math.cos(rad);
		double tan = Math.tan(rad);



		return new double[] {sin , cos , tan};


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angles : ");


		double angle = sc.nextDouble();

		double[] result = calculate(angle);

		
		System.out.println("Sine of " + angle + " = " + result[0]);

		System.out.println("Cosine of " + angle + " = " + result[0]);

		System.out.println("Tangent of " + angle + " = " + result[0]);
		
	}

}
