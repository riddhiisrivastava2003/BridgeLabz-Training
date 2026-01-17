import java.util.*;

public class RemoveDuplicatesStringBuilder {
	
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter string");
        String str=sc.nextLine();
        
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
        
            if(!set.contains(ch)) {
                set.add(ch);


                sb.append(ch);
            }
        }
        
        System.out.println(sb);

        
        
    }}