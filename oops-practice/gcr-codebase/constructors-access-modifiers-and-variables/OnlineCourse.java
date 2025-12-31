

import java.util.Scanner;

class OnlineCourse {
	String courseName;
	int duration;
	double fee;
	
	
	static String instituteName ="BridgeLabz";
	
	OnlineCourse(String courseName , int duration ,double fee){
		this.courseName = courseName;
		this.duration = duration;
	this.fee = fee;
		
		
		
	}
	void displayCourseDetails() {
		System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
        System.out.println("Fee         : " + fee);
        System.out.println("Institute   : " + instituteName);
	}
	static void updateInstitutionName (String newName) {
		instituteName = newName ;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Duration in months: ");
		int duration =sc.nextInt();
		
		System.out.print("Enter Course Fee: ");
		double fee = sc.nextDouble();
		sc.nextLine();
		
		OnlineCourse course = new OnlineCourse(name , duration , fee);
		System.out.println("Enter Updated institute name : ");
		String newInstitute = sc.nextLine();
		OnlineCourse.updateInstitutionName(newInstitute);
		
		course.displayCourseDetails();
		
		
	}
	

}