import java.util.*;
 public class FrequencyOfCharactersUsingNestedLoops{

    static String[] frequency(String s){
        char[] ch=s.toCharArray();
        int[] freq=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
             freq[i]=1;
           
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';

                }



    }
    
 }
int count=0;
for(int i=0;i<freq.length;i++)
    if(ch[i] !='0')count++;
String[] result=new String[count];
int k=0;
for(int i=0;i<freq.length;i++){
    if(ch[i]!='0'){
        result[k++]=ch[i]+ " : "+freq[i];
    }
}
return result;

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

    String[] res=frequency(s);
    for(String r:res)
        System.out.println(r);
}

}