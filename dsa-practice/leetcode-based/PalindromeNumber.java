/*9. Palindrome Number
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1*/ 

import java.util.*;
public class PalindromeNumber{
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;

        }
        int original=x;
        int rev=0;
        
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
       return original==rev;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        System.out.println(isPalindrome(x));
    }
}