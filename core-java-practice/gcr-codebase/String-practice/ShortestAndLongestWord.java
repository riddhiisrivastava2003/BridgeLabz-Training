import java.util.*;
public class ShortestAndLongestWord{
    static int findLen(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }


            }catch(Exception e){

            }
            return count;

        }

        static String[] splitWords(String text){
            int len=findLen(text);
            int count=1;

            for(int i=0;i<len;i++){
                if(text.charAt(i)==' '){
                    count++;
                }


            }

            String[] words=new String[count];
            int start=0,index=0;

            for(int i=0;i<=len;i++){
                if(i==len||text.charAt(i)==' '){
                    String word=" ";
                    for(int j=start;j<i;j++){
                        word=word+text.charAt(j);
                    }
                    words[index++]=word;
                    start=i+1;

                }
            }
            return words;
        }

        static String[][] wordWithLength(String[] words){
            String[][] result=new String[words.length][2];
            for(int i=0;i<words.length;i++){
                result[i][0]=words[i];
                result[i][1]=String.valueOf(findLen(words[i]));

            }
            return result;

        }

        static int[] ShortestAndLongestWord(String[][] result){
            int min=0,max=0;

            for(int i=1;i<result.length;i++){
                int length=Integer.parseInt(result[i][1]);
                if(length<Integer.parseInt(result[min][1])){
                    min=i;
                }
                if(length>Integer.parseInt(result[max][1])){
                    max=i;
                }
            }
            return new int[]{min,max};

        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            String text=sc.nextLine();

            String[] words=splitWords(text);
            String[][] table=wordWithLength(words);
            int[] result=ShortestAndLongestWord(table);

            
            System.out.println("shortest word "+table[result[0]][0]+"Length "+table[result[0]][1]);
            System.out.println("longest word "+table[result[1]][0]+"Length "+table[result[1]][1]);

        }
    }
    
    
