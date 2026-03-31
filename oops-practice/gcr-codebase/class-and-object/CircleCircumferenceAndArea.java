import java.util.*;
public class CircleCircumferenceAndArea {
	
	double radius;
	
	public void calculateArea() {
		double area=Math.PI*radius*radius;
		
		System.out.printf("area of circle %.4f\n",area);
	}
	
	public void calculateCircumference() {
		double circumference=2*Math.PI*radius;
		
		System.out.printf("Circumference %.4f\n",circumference);
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		CircleCircumferenceAndArea circle=new CircleCircumferenceAndArea();
		
		System.out.println("enter the radius");
		circle.radius=sc.nextDouble();
		circle.calculateCircumference();
		circle.calculateArea();
		
		
	}

}
