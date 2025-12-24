
import java.util.Scanner;

public class UnitConvertorTemperature {
	public static double convertFarhenheitToCelcius(double farh) {
		return (farh-32)*5/9;
	}
	public static double convertCelciusToFarhenheit(double celcius) {
		return (celcius*9/5)+32;
	}
	
	public static double convertPoundToKg(double pound) {
		return pound*0.453592;
	}
	
	public static double convertKgToPounds(double kg) {
		return kg*2.20462;
	}
	public static double convertGallonsToLiters(double gallon) {
		return gallon*3.78541;
	}
	public static double convertLitersToGallon(double liters) {
		return liters*0.264172;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice ");
		System.out.println("1. farhenheit to celcuis ");
		System.out.println("2. celcius to farhenheit ");
		System.out.println("3. pound to kg ");
		System.out.println("4. kg to pound ");
		System.out.println("5. gallons to liters ");
		System.out.println("6. liters to gallons ");
		
		int choice=sc.nextInt();
		
		System.out.println("enter unit");
		double unit=sc.nextDouble();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertFarhenheitToCelcius(unit)+" celcius");
			break;
		case 2:
			System.out.println(convertCelciusToFarhenheit(unit)+" farhenheit");
			break;
		case 3:
			System.out.println(convertPoundToKg(unit)+" kg");
			break;
		case 4:
			System.out.println(convertKgToPounds(unit)+" pounds");
			break;
		case 5:
			System.out.println(convertGallonsToLiters(unit)+" liters");
			break;	
		case 6:
			System.out.println(convertLitersToGallon(unit)+" gallon");
			break;	
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}



