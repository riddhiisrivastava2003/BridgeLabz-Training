

import java.util.*;


public class StringBuilderStringBufferComparison {
	
	
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter string");
	String str1=sc.nextLine();
	
	int n=1000000;
	
	
	StringBuffer buffer=new StringBuffer();
	long startbuffer=System.nanoTime();
	
	for(int i=0;i<n;i++) {
		buffer.append(str1);
	}
	
	
	long endbuffer=System.nanoTime();
	long durationbuffer=endbuffer-startbuffer;
	
	

	StringBuffer build=new StringBuffer();
	long startbuild=System.nanoTime();
	
	for(int i=0;i<n;i++) {
		buffer.append(str1);
	}
	
	
	long endbuild=System.nanoTime();
	long durationbuild=endbuild-startbuild;
	
	System.out.println("stringbuffer time: "+(durationbuffer/1_000_000)+" ms");
	System.out.println("stringbuilder time: "+(durationbuild/1_000_000)+" ms");
	
	System.out.println("efficiency gain: "+String.format("%.2f",(double)durationbuffer/durationbuild));
	
}
	
	


}



