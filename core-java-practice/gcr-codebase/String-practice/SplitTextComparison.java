
import java.util.*;


public class SplitTextComparison {
	
	static int findLen(String s) {
		
		int count=0;
		try {
			while(true) {
				s.charAt(count);
				count++;
				
			}
			
		}catch(Exception e) {
			
		}
		return count;
		
	}
	static String[] splitUsingCharAt(String text) {
		
		int len=findLen(text);
		int wordCount=1;
		
		for (int i=0;i<len;i++) {
			if(text.charAt(i)==' ') {
				wordCount++;
			}
		}
		
		String[] words=new String [wordCount];
		int start=0,index=0;
		
		for(int i=0;i<len;i++) {
			if(text.charAt(i)==' ') {
				words[index++]=text.substring(start,i);
				start=i+1;
			}
		}
		words[index]=text.substring(start,len);
		return words;
		
	}
	 static boolean compareArrays(String[] a, String[] b) {
		 if(a.length !=b.length) {
			 return false;
			 
			 for(int i=0;i<a.length;i++) {
				 if(!a[i].equals(b[i]))
					 return false;
			 
			 
		 }
          return true;
		 
	 }
    
     
    
    
		 
		 public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("enter ");
			 String text=sc.nextLine();
			 
			 String[] userWords=splitUsingCharAt(text);
			 
			 String[] builtInWords=text.split(" ");
			 
			 boolean result=compareArrays(userWords,builtInWords);
			 
			 System.out.println("words using charAt() ");
			 for(String w:userWords) {
				 System.out.println(w);
			 }
			 
			 System.out.println("words using split() ");
			 for(String w: builtInWords) {
				 System.out.println(w);
			 }
			 
			 System.out.println("are both same?? "+result);
		 }
	
        }
