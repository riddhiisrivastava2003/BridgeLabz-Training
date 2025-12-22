import java.util.*;
public class UniqueCharacterFrequency{
 
    static char[] uniqueChar(String s){
        char[] temp=new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++){
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

        char[] unique=new char[k];
        for(int i=0;i<k;i++){unique[i]=temp[i];}
            return unique;
        
    }
        static String[][] frequency(String s){
        int[] freq=new int[256];
        
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        char[] unique=uniqueChar(s);
        String[][] result=new String[unique.length][2];
        for(int i=0;i<unique.length;i++){
            result[i][0]=String.valueOf(unique[i]);
            result[i][1]=String.valueOf(freq[unique[i]]);
        }
        return result;
        

        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[][] res=frequency(s);
            for(String[] row:res){
                System.out.println(row[0]+"\t\t"+row[1]);
            }       
        }
    }
