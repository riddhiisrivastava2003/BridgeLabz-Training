

import java.util.*;

public class UnitConvertorProgram2 {
	public static double convertYardsToFeet(double yards) {
		return yards*3;
	}
	public static double feetsToYards(double feet) {
		return feet*0.333333;
	}
	
	public static double convertMetersToInches(double meter) {
		return meter*39.3701;
	}
	
	public static double convertInchesToMeter(double inches) {
		return inches*0.0254;
	}
	public static double convertInchesToCentimeter(double inches) {
		return inches*2.54;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice ");
		System.out.println("1. yards to feets ");
		System.out.println("2. feets to yards ");
		System.out.println("3. meter to inches ");
		System.out.println("4. inches to meter ");
		System.out.println("5. inches to centimeter ");
		
		int choice=sc.nextInt();
		
		System.out.println("enter distance");
		double distance=sc.nextDouble();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertYardsToFeet(distance)+" feets");
			break;
		case 2:
			System.out.println(feetsToYards(distance)+" yards");
			break;
		case 3:
			System.out.println(convertMetersToInches(distance)+" inches");
			break;
		case 4:
			System.out.println(convertInchesToMeter(distance)+" meters");
			break;
		case 5:
			System.out.println(convertInchesToCentimeter(distance)+" centimeters");
			break;	
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}



