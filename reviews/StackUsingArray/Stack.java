package StackUsingArray;

	
import java.util.*;

public class Stack{
		
		private int arr[];
		private int top;
		
		private int size;
		
	



	public Stack(int size) {
		this.size=size;
		arr=new int[size];
		top=-1;
		}
	
//	arr = {3,4,5,6};
	
	
	//push operation bana diya
	
	public void pushOperation(int value) {
		if(top==size-1) {
			System.out.println("Stack Overflowed");
		}
		arr[++top]=value;
		System.out.println("value pushed");

}
	
	// pop operation
	
	public void popOperation() {
		if(top==-1) {
			System.out.print("stack underflow");
			return;
		}
		
	    
		System.out.println("value popped "+arr[top--]);
	}
	
	
	//peek opeartion banaya
	public void peek() {
		if(top==-1) System.out.print("stack is empty");
		System.out.println("peeked value"+arr[top]);
		}
	
	
	//displayy 
	public void display() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
			
		}
		
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
}
