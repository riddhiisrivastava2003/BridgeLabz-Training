/*20. Valid Parentheses
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false*/
import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        Map<Character,Character> mapp=new HashMap<>();
        mapp.put(')','(');
        mapp.put(']','[');
        mapp.put('}','{');
        for(char c: s.toCharArray()){
            if(mapp.containsValue(c)){
                st.push(c);
            }
            else if(mapp.containsKey(c)){
                if(st.isEmpty()||mapp.get(c)!=st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
