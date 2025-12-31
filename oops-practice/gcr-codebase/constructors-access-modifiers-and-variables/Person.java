

import java.util.*;


 class Person {
	
	 String name;
	 int age;
	 
	 
	 Person(String name, int age){
		 this.name=name;
		 this.age=age;
		 
	 }
	 
	 Person(Person p){
		 this.name=p.name;
		 this.age=p.age;
	 }
	 
	 
	 void display() {
		 System.out.println("name "+name+" age "+age);
	 }
	
	 
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter name");
		 String n=sc.nextLine();
		 System.out.println("enter age");
		 int age=sc.nextInt();
		 
		 Person p1=new Person(n,age);
		 
		 Person p2=new Person(p1);
		 
		 p1.display();
		 p2.display();
	 }

}
