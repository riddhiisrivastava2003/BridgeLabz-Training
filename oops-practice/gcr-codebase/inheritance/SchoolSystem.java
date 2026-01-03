

import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		
	}
}


class Teacher extends Person{
	String subject;
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject=subject;
		
	}
	
	void display() {
		System.out.println(name+ " teacher teaches "+subject);
	}
	
}

class Student extends Person{
	String grade;
	Student(String name, int age, String grade){
		super(name,age);
		this.grade=grade;
		
	}
	
	void display() {
		System.out.println(name+ " student got grade "+grade);
	}
	
}
class Staff extends Person{
	String department;
	Staff(String name, int age, String department){
		super(name,age);
		this.department=department;
		
	}
	
	void display() {
		System.out.println(name+ " staff has department "+department);
	}
	
}

public class SchoolSystem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter role(teacher/student/staff):");
		String type=sc.nextLine();
		
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		
		sc.nextLine();
		
		Person person=null;
		
		switch (type) {
		case "teacher":
			System.out.println("enter subject");
			String subject=sc.nextLine();
			person=new Teacher(name,age,subject);
			((Teacher)person).display();
			break;
		case "student":
			System.out.println("enter grade");
String grade=sc.nextLine();
			person=new Student(name,age,grade);
			((Student)person).display();
			break;
		case "staff":
			System.out.println("enter department");
			String dept=sc.nextLine();
			person=new Staff(name,age,dept);
			((Staff)person).display();
			break;
			
			default:
				System.out.println("invaild input");break;
			
			
		}
		
	
		
		
	}
}



