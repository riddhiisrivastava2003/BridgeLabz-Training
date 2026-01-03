

import java.util.*;




	
	class Animal{
		String name;
		int age;
		
		Animal(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		void sound(){
			System.out.println("animals make sound");
		}
	}
	
	class Dog extends Animal{
		Dog(String name, int age){
			super(name,age);
		}
		
		@Override
		 void sound() {
			System.out.println(name+" barks");
		}
	}
	
	class Cat extends Animal{
		
		Cat(String name, int age){
			super(name,age);
		}
		@Override
		void sound() {
			System.out.println(name+" meows");
		}
	}
	
	class Bird extends Animal{
		Bird(String name, int age){
			super(name,age);
		}
		@Override
		void sound() {
			System.out.println(name+" chirps");
		}
	}
	
	public class AnimalHeirarchy{
		 public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("enter animal type (dog/cat/bird)");
			 
			 String type=sc.nextLine();
			 
			 System.out.println("enter animal name");
			 String name=sc.nextLine();
			 
			 
			 System.out.println("enter animal age");
			 int age=sc.nextInt();
			 
			 
			 Animal animal = null;//polymorphism
			 
			 
			 switch(type) {
			 case "dog":
				 animal=new Dog(name,age);
				 break;
			 
		 case "cat":
			 animal=new Cat(name,age);
			 break;
		 case "bird":
			 animal=new Bird(name,age);
			 break;
			 
			 default:
				 System.out.println("invalid type ");
		 
				 
		 }
			 
			 System.out.println("animal details: ");
			 System.out.println("name: "+animal.name);
			 System.out.println("age: "+animal.age);
			 System.out.println("sound: ");
			 animal.sound();
			 
	}
		 }

