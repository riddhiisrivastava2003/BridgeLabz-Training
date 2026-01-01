

import java.util.*;

public class Student {
	
	private static String universityName="Gla University";
	private static int totalStudents=0;
	
	private final int rollNumber;
	
	private String name;
	private String grade;
	
	public Student(int rollNumber,String name,String grade) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.grade=grade;
		totalStudents++;
	}
	
	public static void displayTotalStudents() {
		System.out.println("total students: "+totalStudents);
	}
	public void updateGrade(String newGrade) {
		if(this instanceof Student) {
			this.grade=newGrade;
			System.out.println("grade updated to: "+newGrade);
		}
		else {
			System.out.println("invalid student");
		}
	}
	
	public void displayDetails() {
		if(this instanceof Student) {
			System.out.println("unversity name: "+universityName);
			System.out.println("roll number: "+rollNumber);
			System.out.println("name: "+name);
			System.out.println("grade: "+grade);
			
			
		}
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of students");
		int n=sc.nextInt();
		sc.nextLine();
		
		Student[] student=new Student[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter details for student "+(i+1));
			
			System.out.println("enter roll number");
			int roll=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter name");
			String name=sc.nextLine();
			
			System.out.println("enter grade");
			String grade=sc.nextLine();
			
			student[i]=new Student(roll,name,grade);
		}
		
		System.out.println();
		Student.displayTotalStudents();
		
		for(int i=0;i<n;i++) {
			student[i].displayDetails();
			
		}
		
		
		System.out.println("enter roll number to update grade ");
		int updateRoll=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter new grade: ");
		String newGrade=sc.nextLine();
		
		for(int i=0;i<n;i++) {
			if(student[i] instanceof Student && student[i].rollNumber==updateRoll) {
				student[i].updateGrade(newGrade);
				student[i].displayDetails();
				break;
			}
		}
	
		
	}

}
