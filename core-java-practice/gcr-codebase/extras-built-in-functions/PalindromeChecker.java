import java.util.*;
public class PalindromeChecker{

    public static String  takingInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        return  sc.nextLine();
        
    }

    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start) !=str.charAt(end)){
                return false;
            }

            start++;
            end--;

        }

        return true;

    }

    public static void displayResult(boolean result){
        if(result){
            System.out.println("the string is a palindrome");
        }

        else{
            System.out.println("the string is not palindrome");
        }


    }

    public static void main(String args[]){
        String input=takingInput();
        boolean result=isPalindrome(input);
        displayResult(result);
    }
}
