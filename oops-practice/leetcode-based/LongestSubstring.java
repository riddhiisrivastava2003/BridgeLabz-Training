/*. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int high=0; high<s.length(); high++) {
            char current = s.charAt(high);

            if(map.containsKey(current) && map.get(current) >= low) {
                low = map.get(current) + 1;
            }
            map.put(current, high);
            maxlen = Math.max(maxlen, high - low + 1);
        }
        return maxlen;
    }


public static void main(String args[]){
    LongestSubstring  longest=new LongestSubstring ();

    String input ="abcabcbb";
    int result=longest.lengthOfLongestSubstring(input);
    System.out.println("input: "+input);
    System.out.println("output: "+result);


}
}