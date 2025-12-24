
import java.util.*;

public class HeightsAndWeights {
	
	public static String youngest(String[] names,int[] ages) { 
		int min=ages[0];
		int ind=0;
		for(int i=1;i<ages.length;i++ ) {
			if(ages[i]<min) {
				min=ages[i];
				ind=i;
			}
		}
		return names[ind];
	} 
	public static String tallest(String[] names, double[] height) {
		
		double max=height[0];
		int ind=0;
		for(int i=0;i<height.length;i++) {
			if(height[i]>max) {
				max=height[i];
				ind=i;
			}
		}
		return names[ind];
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String[] names= {"amar","akbar","anthony"};
		
		int[] age=new int[3];
		double[] height=new double[3];
		
		System.out.println("enter the ages of amar, akbar, anthony respectively");
		for(int i=0;i<3;i++) {
			age[i]=sc.nextInt();
		}
		System.out.println("enter the heights of amar, akbar, athony respectively");
		for(int i=0;i<3;i++) {
			height[i]=sc.nextDouble();
		}
		
		System.out.println("the tallest friend is "+tallest(names,height));
		System.out.println("the youngest friend is "+youngest(names,age));
		
		
		
	}

}
