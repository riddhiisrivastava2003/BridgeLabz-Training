package stacks_And_queues;

import java.util.*;


class QueueImplementation{
	//push or pop ke liye do stack bana liye
	Stack<Integer> stackIn=new Stack<>();
	Stack<Integer> stackOut=new Stack<>();
	
	//stack me value daal di
	void enqueue(int x) {
		stackIn.push(x);
	}
	
	//dequeue karna h
	
	int dequeue() {
		if(stackOut.isEmpty()) {
			while(!stackIn.isEmpty()) {
				stackOut.push(stackIn.pop());
				
			}
		}
		
		return stackOut.pop();
		
	}
	
	
	
}

public class QueueUsingStack {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		QueueImplementation q=new QueueImplementation();
		
		System.out.println("number of elements");
		int n=sc.nextInt();
		
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++) {
			q.enqueue(sc.nextInt());
		}
		
		System.out.print("queue after implementation: ");
		while(!q.stackIn.isEmpty() || !q.stackOut.isEmpty()) {
			System.out.print(q.dequeue()+" ");
			
		}
	}
}
