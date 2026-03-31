import java.util.*;
public class CensorBadWords{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a sentence");
        String input=sc.nextLine();

        String[] badwords={"damn","stupid"};

        String result=input;

        for(String word:badwords){
            result=result.replaceAll("(?i)\\b" + word + "\\b", "****");
            }
        System.out.println(result);
    



    }
}