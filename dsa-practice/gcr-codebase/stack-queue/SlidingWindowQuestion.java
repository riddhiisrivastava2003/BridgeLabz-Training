package stacks_And_queues;

import java.util.*;


public class SlidingWindowQuestion {
	
	static void printMaxWindow(int[] arr,int n,int k) {
		Deque<Integer> dequeue=new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			while(!dequeue.isEmpty() && dequeue.getFirst() <=i-k) {
				
				dequeue.removeFirst();
			}
			
			while(!dequeue.isEmpty() && arr[i]>=arr[dequeue.getLast()]) {
				dequeue.removeLast();
			}
			
			dequeue.addLast(i);
			if(i>=k-1) {
				
				System.out.println(arr[dequeue.getFirst()]+" ");
				
			}
			
		}
		
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array size");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter window size:");
		int k=sc.nextInt();
		
		
		System.out.print("sliding window max:");
		printMaxWindow(arr,n,k);
	}
	
	

}
