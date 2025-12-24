

import java.util.*;

public class StudentvoteChecker {

	
	public static boolean canStudentVote(int age) {
		
		if(age<0){
			return false;
		}
		
		return age>=18;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int[] age=new int[10];
		
		System.out.println("Enter ages");
		for(int i=0;i<10;i++) {
			age[i]=sc.nextInt();
			
			
		}
		
		
		
		for(int i=0;i<age.length;i++) {
			
			
			if(canStudentVote(age[i])) {
				System.out.println("Student "+(i+1)+" can vote");
				
			}
			else {
				System.out.println("Student "+(i+1)+" cannot vote");
			}
			
			
		}
		
	}
	
}
