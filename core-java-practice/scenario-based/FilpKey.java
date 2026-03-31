import java.util.*;

public class FilpKey{
    public static String CleanseAndInvert(String input){

        if(input==null || input.length()<6){
            return "";
        }

        for(char ch:input.toCharArray()){
            if(!Character.isLetter(ch)){
                return "";
            
            }
        }

        input=input.toLowerCase();
        
        StringBuilder filtered=new StringBuilder();
        for(char ch:input.toCharArray()){
            if((int) ch%2!=0){
                filtered.append(ch);

            }
        }

        filtered.reverse();
        for(int i=0;i<filtered.length();i++){
            if(i%2==0){
                filtered.setCharAt(i,Character.toUpperCase(filtered.charAt(i)));

            }
        }
        return filtered.toString();

        }



        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the string");
            String input=sc.nextLine();

            String result=CleanseAndInvert(input);

            System.out.println();
            if(result.isEmpty()){
                System.out.println("invalid input");
            }
            else{
                System.out.println(result);
            }
        }
    }

