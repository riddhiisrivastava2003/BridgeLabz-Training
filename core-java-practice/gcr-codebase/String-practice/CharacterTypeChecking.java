import java.util.*;
public class CharacterTypeChecking{
    static String characterChecking(char ch){
        if(ch>='A' && ch<= 'Z'){
            ch=(char)(ch+32);
        }
        if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            return "Vowel";
        }
        else if(ch>='a' && ch<='z'){
            return "Consonant";
        }
        else{
            return "Not a letter";
        }
    }

    static String[][] findCharacterTypes(String text){
        String[][] result=new String[text.length()][2];
         for(int i=0;i<text.length();i++){
            result[i][0]=String.valueOf(text.charAt(i));
            result[i][1]=characterChecking(text.charAt(i));
         }
         return result;
    }

    static void displayType(String[][] result){
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter ");
        String text=sc.nextLine();

        String[][] result=findCharacterTypes(text);
        displayType(result);
    }
    
}