//package stacks_And_queues;

import java.util.*;


public class StockSpanStack {
	
	static void spanCalculation(int []price,int n) {
		Stack<Integer> stack=new Stack<>();
		
		int[] span=new int[n];
		
		stack.push(0);
		span[0]=1;
		
		for(int i=1;i<n;i++) {
			while(!stack.isEmpty() && price[stack.peek()]<=price[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				span[i]=i+1;
				
			}
			else {
				span[i]=i-stack.peek();
				
				
			}
			stack.push(i);
		}
			System.out.println("stock spans: ");
			for(int s:span) {
				System.out.print(s+" ");
			}
			
			
			
		}
		
		
		
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of days: ");
		int n=sc.nextInt();
		
		int[] price=new int[n];
		
		System.out.println("enter stoack price:");
		for(int i=0;i<n;i++) {
			price[i]=sc.nextInt();
		}
		spanCalculation(price,n);
	}

}
