

import java.util.*;
public class UnitConvertorProgram {
	
	public static double convertKmToMiles(double km) {
		return km*0.621371;
	}
	public static double convertMilesToKm(double miles) {
		return miles*1.60934;
	}
	
	public static double convertMetersToFeets(double meter) {
		return meter*3.28084;
	}
	
	public static double convertFeetToMeter(double feets) {
		return feets*0.3048;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice ");
		System.out.println("1. kilometer to miles ");
		System.out.println("2. miles to kilometer ");
		System.out.println("3. meter to feet ");
		System.out.println("4. feet to meter ");
		
		int choice=sc.nextInt();
		
		System.out.println("enter distance");
		int distance=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertKmToMiles(distance)+" miles");
			break;
		case 2:
			System.out.println(convertMilesToKm(distance)+" km");
			break;
		case 3:
			System.out.println(convertMetersToFeets(distance)+" feets");
			break;
		case 4:
			System.out.println(convertFeetToMeter(distance)+" meters");
			break;
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}
