import java.util.*;

public class AnagramCheck{
    public static boolean anagramCheck(String str1,String str2){
        str1=str1.replaceAll("\\s+"," ").toLowerCase();
        str2=str2.replaceAll("\\s+"," ").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

           char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1,arr2);


    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1");

        String str1=sc.nextLine();

          System.out.println("enter 2");
        
        String str2=sc.nextLine();

        if(anagramCheck(str1,str2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }




    }

 




}