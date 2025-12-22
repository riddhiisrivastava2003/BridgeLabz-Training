import java.util.*;
public class UniqueCharacters{
    static int findLen(String s){
        int i=0;
        try{
            while(true){
                s.charAt(i);
                i++;
            }
         } catch (Exception e){

         }
        
        return i;
    }

    static char[] uniqueChars(String s){
        int n=findLen(s);
        char[] temp=new char[n];
        int k=0;

        for(int i=0;i<n;i++){
            boolean unique=true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    unique=false;
                    break;
                }
            }

            if(unique)
                temp[k++]=s.charAt(i);
        }
        char[] result=new char[k];
        for(int i=0;i<k;i++)
            result[i]=temp[i];
        return result;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ");
        String s=sc.nextLine();

        char[] res=uniqueChars(s);
        for(char c:res){
            System.out.print(c+" ");
        }
    }
} 




