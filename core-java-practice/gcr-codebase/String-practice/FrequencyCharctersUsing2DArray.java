import java.util.*;
 public class FrequencyCharctersUsing2DArray{
    static String[][] frequency(String s){
        int[] freq=new int[256];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        int count=0;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]>0)
                count++;
        }

        String[][] result=new String[count][2];
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]>0){
                result[k][0]=String.valueOf(c);
                result[k][1]=String.valueOf(freq[c]);
                freq[c]=0;
                k++;
            }

        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[][]res=frequency(s);

        for(String[] row:res){
            System.out.println(row[0]+"\t\t"+row[1]);
        }

    }
 }