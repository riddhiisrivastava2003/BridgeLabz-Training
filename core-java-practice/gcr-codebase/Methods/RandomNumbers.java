

import java.util.*;
public class RandomNumbers {
	public static int[] generate4DigitRandomArray(int size) {
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=1000+(int)(Math.random()*9000);
		}
		return arr;
	}
	
	public static double[] findAverageMinMax(int[] numbers) {
		int sum=0;
		int min=numbers[0];
		int max=numbers[0];
		
		for(int i:numbers) {
			sum=sum+i;
			min=Math.min(min, i);
			max=Math.max(max, i);
		}
		
		double avg=sum/(double) numbers.length;
		return new double[] {avg,min,max};
	}
	
	public static void main(String[] args) {
		int[] nums= generate4DigitRandomArray(5);
		
		System.out.println("random numbers");
		for(int i:nums) {
			System.out.print(i+" ");
			
		}
		
		double[] result=findAverageMinMax(nums);
		
		System.out.println("average "+result[0]);
		System.out.println("minimum "+(int)result[1]);
		System.out.println("maximum "+(int)result[2]);
		
	}

	
	

	

}
