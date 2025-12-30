
import java.util.*;



public class LineComparisonProblem {
	//cartesian system k through line ki length calculate karre h 
	
	public static double cartesianSystem(int x1,int y1,int x2,int y2) {
		
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
	}

	
	
	public static void equalityCheck(Double length1,Double length2) {
		
		// line equal h ya nhi ye check karre h 
		System.out.println("Use case 2: checking if the lines are equal");
		if(length1.equals(length2)) {
			
			
			System.out.println("Both lines are equal");
			
		}
		else {
			System.out.println("The lines are not equal");
		}
	}
	
	public static void comparingLines(Double length1, Double length2) {
		
		// line ki lengths compare karr ah 
		int result=length1.compareTo(length2);
		System.out.println("Use case 3: comparing two lines ");
		
		if(result==0) System.out.println("both lines are equal");
		else if (result>0) System.out.println("line 1 is greater than line 2");
		else System.out.println("line 2 is greater than line 1");
		
		
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the coordinates int x1,y1,x2,y2 format");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		System.out.println("enter the coordinates int x3,y3,x4,y4 format");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		
		
		
		Double line1length=cartesianSystem(x1,y1,x2,y2);
		Double line2length=cartesianSystem(x3,y3,x4,y4);
		
		

		
		System.out.println("Use case1: cartesian system length ");
		System.out.println("Length of line 1 "+line1length);
		System.out.println("Length of line 2 "+line2length);
		System.out.println();
		
		equalityCheck(line1length,line2length);
		System.out.println();
		comparingLines(line1length,line2length);
		System.out.println();
		
		
		

			
		}
		
		
		
		
		
		
		
		
		
	}

