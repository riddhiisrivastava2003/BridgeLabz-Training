package stacks_And_queues;

import java.util.*;


public class CicularTourQuestion {
	
	static int findingStartPump(int[] petrol, int[] dis, int n) {
		int start=0;
		int current=0;
		int total=0;
		
		
		for(int i=0;i<n;i++) {
			int surplus=petrol[i]-dis[i];
			current+=surplus;
			total+=surplus;
			
			
			if(current<0) {
				start=i+1;
				current=0;
			}
			
			
		}
		
		return (total>=0)?start:-1;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter number of petrol pump: ");
		int n=sc.nextInt();
		
		int[] petrol=new int[n];
		int[] dis=new int[n];
		
		
		
		System.out.println("enter petrol at each pump: ");
		for(int i=0;i<n;i++) {
			petrol[i]=sc.nextInt();
			
		}
		
		System.out.println("enter distance to next pump: ");
		for(int i=0;i<n;i++) {
			dis[i]=sc.nextInt();
			
		}
		
		int startPump=findingStartPump(petrol,dis,n);
		
		if(startPump!=-1) {
			System.out.println("start at index: "+startPump);
			
		}
		
		else {
			System.out.println("no possible starting pump!");
		}
	}

}
