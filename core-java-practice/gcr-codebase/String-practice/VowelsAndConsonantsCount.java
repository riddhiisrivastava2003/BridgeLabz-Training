import java.util.*;
public class VowelsAndConsonantsCount{

    static String checkCharacter(char ch){
        if(ch>='A'&& ch<='Z'){
            ch=(char)(ch+32);
        }

        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
            return "vowel";
        }
        else if(ch>='a' && ch<='z'){
            return "consonant";
        }
        else{
            return "Not a letter";
        }

    }
    static int[] countVowelsAndConsonants(String text){
        int vowels=0,consonants=0;

        for(int i=0;i<text.length();i++){
            String result=checkCharacter(text.charAt(i));
             if(result.equals("vowel")){
                vowels++;
            }
            else if(result.equals("consonant")){
                consonants++;
            }
        }
        return new int[]{vowels,consonants};
            }
            public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        int[] result=countVowelsAndConsonants(text);  
        
        System.out.println("vowels "+result[0]);
        System.out.println("consonants "+result[1]);
        }
    }
    
