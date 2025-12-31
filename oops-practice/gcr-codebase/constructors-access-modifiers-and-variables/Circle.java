

import java.util.*;

class Circle {
	
	double radius;
	
	Circle(){
		this(1.0);
	}
	
	Circle (double radius){
		this.radius=radius;
	}
	
	void display() {
		System.out.println("radius: "+radius);
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter radius");
		double rad=sc.nextDouble();
		
		Circle c1=new Circle();
		Circle c2=new Circle(rad);
		
		c1.display();
		c2.display();
	}
	
	

}
