

import java.util.*;

public class Student {
	
	String name;
	String roll_number;
	double mark1,mark2,mark3;
	
	public char calculateGrade() {
		double average=(mark1+mark2+mark3)/3;
		
		if(average>=75) return 'A';
		else if (average>=60) return 'B';
		else if(average>=50) return 'C';
		else return 'D';
	}
	
	public void displayDetails() {
		System.out.println("student name "+name);
		System.out.println("roll number "+roll_number);
		System.out.println("mark1 "+mark1);
		System.out.println("mark2 "+mark2);
		System.out.println("mark3 "+mark3);
		System.out.println("grade awarded "+calculateGrade());
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of students");
		int n=sc.nextInt();
		sc.nextLine();
		
		Student[] student=new Student[n];
		
		for(int i=0;i<n;i++) {
			student[i]=new Student();
			
			System.out.println("enter details for student "+(i+1));
			
			System.out.println("enter name");
			student[i].name=sc.nextLine();
			System.out.println("enter roll number");
			student[i].roll_number=sc.nextLine();
			System.out.println("enter mark1");
			student[i].mark1=sc.nextInt();
			System.out.println("enter mark2");
			student[i].mark2=sc.nextInt();
			System.out.println("enter mark3");
			student[i].mark3=sc.nextInt();
			sc.nextLine();
			
		}
		for(int i=0;i<n;i++) {
			student[i].displayDetails();
		}
	}

}
