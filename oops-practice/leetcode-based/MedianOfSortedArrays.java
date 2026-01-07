/*4. Median of Two Sorted Arrays
Solved
Hard
Topics
premium lock icon
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/
import java.util.*;
public class  MedianOfSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;

        int[] new_arr = new int[len];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        while (i < len1) {
            new_arr[k++] = nums1[i++];
        }
        while (j < len2) {
            new_arr[k++] = nums2[j++];
        }

        if (len % 2 == 0) {
            return (float) (new_arr[len / 2 - 1] + new_arr[len / 2]) / 2;
        } else {
            return (float) (new_arr[len / 2]);
        }
    }

    public static void main(String args[]){

        MedianOfSortedArrays obj=new MedianOfSortedArrays();
        
        int[] nums1={1,3};
        int[] nums2={2};
        double result=obj.findMedianSortedArrays(nums1,nums2);
        System.out.println("input1: "+Arrays.toString(nums1));
        System.out.println("input2: "+Arrays.toString(nums2));
        System.out.println("output: "+result);


    }
}