import java.util.*;
import java.util.regex.*;

public class ExtractEmails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter email: ");
        String email=sc.nextLine();

    String regex="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher(email);

      while(matcher.find()){
        System.out.println(matcher.group());
      
      }

     
    }
}