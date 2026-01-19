import java.util.*;
public class StringConcatenationPerformance{
    public static void testString(int n){
        String s="";
        long start=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            s+="a";
        }

        long end=System.currentTimeMillis();
        System.out.println("string time:       "+(end-start)+" ms");



    }



    public static void testStringBuilder(int n){
        StringBuilder sb=new StringBuilder();

        long start=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            sb.append("a");
        }
        


        long end=System.currentTimeMillis();
        System.out.println("string builder time: "+(end-start)+" ms");

    }




    public static void testStringBuffer(int n){
        StringBuffer sb=new StringBuffer();

        long start=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            sb.append("a");
        }


        long end=System.currentTimeMillis();
        System.out.println("string buffer time: "+(end-start)+" ms");

    }


    public static void main(String args[]){

        int[] size={1000,10000,100000,500000};

        for(int n: size){
            System.out.println("dataset size: "+n);
            testString(n);
            testStringBuilder(n);
            testStringBuffer(n);
            System.out.println();
        }

    }
}




