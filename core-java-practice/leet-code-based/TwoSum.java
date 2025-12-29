/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.*/




import java.util.*;


public class TwoSum {
	
	public static int[]  twoSum(int[]nums,int target) {
		HashMap<Integer,Integer> set=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int diff=target-nums[i];
			
			if(set.containsKey(diff)) {
				return new int[] {set.get(diff),i};
			}
			set.put(nums[i],i);
		}
		return new int[] {};
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] nums=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		System.out.println("enter target");
		int target=sc.nextInt();
		
		int[] result=twoSum(nums,target);
		
		if(result.length==2) {
			System.out.println("indices "+result[0]+", "+result[1]);
			System.out.println("target is "+target);
			System.out.println("numbers "+nums[result[0]]+" and "+nums[result[1]]);
		}
		else {
			System.out.println("no solution found");
		}
}
	
	
	

}
