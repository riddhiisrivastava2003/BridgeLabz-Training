

import java.util.*;


public class QuadracticEquation {
	
	public static double[] roots(double a, double b, double c ) {
		double delta=Math.pow(b, 2)-4*a*c;
		
		if(delta>0) {
			double r1=(-b+Math.sqrt(delta))/(2*a);
			double r2=(-b-Math.sqrt(delta))/(2*a);
			
			return new double[] {r1,r2};
		}
		
		else if(delta==0) {
			double r=-b/(2*a);
			return new double[] {r};
			}
		else {
			return new double[] {};
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b,c");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double[] root=roots(a,b,c);
		
		if(root.length==2) {
			System.out.println("two roots "+root[0]+" , "+root[1]);
			
		}
		else if(root.length==1) {
			System.out.println("one root "+root[0]);
		}
		
		else {
			System.out.println("no real roots");
		}
	}
	
	

}
