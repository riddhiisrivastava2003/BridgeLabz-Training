import java.util.*;

public class SentenceFormatter{
public static String format(String paragraph){
    if(paragraph==null || paragraph.trim().isEmpty()){
        return " ";
    }

    paragraph=paragraph.trim().replaceAll("\\s+"," ");

    paragraph=paragraph.replaceAll("\\s*([.!?])\\s*","$1 ");

    StringBuilder result=new StringBuilder();
    boolean capitalizeNext=true;


    for(char ch:paragraph.toCharArray()){
        if(capitalizeNext && Character.isLetter(ch)){
            result.append(Character.toUpperCase(ch));
            capitalizeNext=false;

        }else{
            result.append(ch);
        }
        if(ch=='.' || ch=='!' || ch=='?'){
            capitalizeNext=true;
        }
    }
    return result.toString().trim();
}

public static void main(String args[]){
    String str="hello   world.this is   a test!how are you?";
    System.out.println(format(str));
}
}