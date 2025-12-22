import java.util.*;
public class TrimLeadingAndTrailingSpaces{

    static int[] trimIndexes(String text){
        int start=0;
        int end=text.length()-1;

        while(start<=end && text.charAt(start)==' '){
            start++;
        }

        while(end>=start && text.charAt(end)==' '){
            end--;
        }

        return new int[]{start,end};
    }

    static String createSubString(String input,int start,int end){
        String s=" ";
        for(int i=start;i<=end;i++){
            s=s+input.charAt(i);

        }
        return s;

    }

    static boolean stringComparison(String s1,String s2){
        if(s1.length() !=s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) !=s2.charAt(i)){
                return false;
            }

        }
        return  true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        int[] index=trimIndexes(input);
        String trimText=createSubString(input,index[0],index[1]);

        String builtInTrim=input.trim();

        boolean isEqual=stringComparison(trimText, builtInTrim);

        System.out.println("trimmed text:  "+trimText);
        System.out.println("trimmed text using built in method:  "+builtInTrim);
        System.out.println("are both same? "+isEqual);






}
}
