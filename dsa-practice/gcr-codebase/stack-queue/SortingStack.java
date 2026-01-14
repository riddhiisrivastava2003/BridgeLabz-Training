package stacks_And_queues;

import java.util.*;

public class SortingStack {
	
	static void sortStack(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int topElement=stack.pop();
			sortStack(stack);
			insertSort(stack,topElement);
		}
	}
	
	
	
	static void insertSort(Stack<Integer> stack,int value) {
		if(stack.isEmpty() || stack.peek()<=value) {
			stack.push(value);
			return;
		}
		
		int topElement=stack.pop();
		insertSort(stack,value);
		stack.push(topElement);
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		Stack<Integer> stack=new Stack<>();
		
		System.out.println("number of elements");

		int n=sc.nextInt();
		
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		
		System.out.println("original stack: "+stack);
		sortStack(stack);
		System.out.println("sorted stack: "+stack);
		
	}

}
