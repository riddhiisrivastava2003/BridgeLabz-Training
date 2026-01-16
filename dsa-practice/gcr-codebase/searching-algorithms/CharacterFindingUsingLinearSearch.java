import java.util.*;

public class CharacterFindingUsingLinearSearch {
    public static String findSentence(String[] sentence,String word){
        for(String s:sentence){
            if(s.toLowerCase().contains(word.toLowerCase())){
            return s;
        }

        }
        return "Not Found";
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of sentences");
        int n=sc.nextInt();
        sc.nextLine();
        String[] sentence=new String[n];

        
        System.out.println("enter the sentences");
        for(int i=0;i<n;i++){
            sentence[i]=sc.nextLine();
        }

        System.out.println("enter the target word");
        String target=sc.nextLine();

        

        System.out.println("the sentence is: "+findSentence(sentence,target));

    }
}