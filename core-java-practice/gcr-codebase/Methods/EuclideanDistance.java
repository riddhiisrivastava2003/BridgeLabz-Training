

import java.util.*;


public class EuclideanDistance {
	
	public static double distanceCalculation(double x1,double y1, double x2,double y2) {
		return Math.sqrt(
				Math.pow(x2-x1,2)+
				Math.pow(y2-y1, 2)
				);
	}
	
	public static double[] lineEquation(double x1, double y1, double x2,double y2) {
		if(x2-x1==0) {
			return null;
		}
		
		double m=(y2-y1)/(x2-x1);
		double b=y1-(m*x1);
		
		return new double[] {m,b};
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter x1 ");
		double x1=sc.nextDouble();
		
		System.out.println("enter x2 ");
		double x2=sc.nextDouble();
		
		System.out.println("enter y1 ");
		double y1=sc.nextDouble();
		
		System.out.println("enter y2 ");
		double y2=sc.nextDouble();
		
		double distance=distanceCalculation(x1,y1,x2,y2);
		
		System.out.println("euclidean distance = "+distance);
		
		
		double[] lineDistance=lineEquation(x1,y1,x2,y2);
		
		
		if(lineDistance==null) {
			System.out.println("the line is vertical....the equation x= "+x1);
			
		}
		
		else {
			System.out.println("the equation of the line");
			
			System.out.println("y= "+lineDistance[0]+"x + "+lineDistance[1]);
		}
		
		
		
		
	}
	
	

}
