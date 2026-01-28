package StackUsingArray;

import java.util.*;


public class StackUsingArrayImplementation {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the size");
		int size=sc.nextInt();
		
		
		
		
		Stack st=new Stack(size);
		
				
		while(true) {
			
			//System.out.print("enter your choice 1. push 2.pop 3.peek 4. display: ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. display");
			System.out.println("5. exit");
			int choice=sc.nextInt();

		
		switch(choice) {
		
		case 1: 
			
			System.out.print("enter the value to be pushed: ");
			st.pushOperation(sc.nextInt());
			break;
		
		
		case 2:
			System.out.println();
			st.popOperation();
			break;
			
		case 3:
			System.out.println();
			st.peek();
			break;
			
		case 4:
			System.out.println();
			st.display();
			break;
			
		case 5:
			System.out.println();
			System.out.println("System closed");
			sc.close();
			return;
			
		default:
			System.out.println();
			System.out.print("invalid entry");
			break;
		}
		}
		
		
		
		
		
	}

	
	
}
