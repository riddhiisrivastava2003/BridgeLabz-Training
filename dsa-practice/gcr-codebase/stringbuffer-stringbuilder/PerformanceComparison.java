
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PerformanceComparison{
    public static void compareStringBuilderAndStringBuffer(){
        int iteration=1_000_000;

        String text="hello world";

        long startNuilder=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<iteration;i++){
            sb.append(text);
        }
        long endNuilder=System.currentTimeMillis();


        long startBuffer=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<iteration;i++){
            buffer.append(text);
        }
        long endBuffer=System.currentTimeMillis();


        System.out.println("stringbuilder time: "+(endNuilder-startNuilder)+" ms");
        System.out.println("stringbuffer time: "+(endBuffer-startBuffer)+" ms");

    }
        

        public static int countWords(String line,int count){
            if(line==null || line.trim().isEmpty()) return count;
            return count+line.trim().split("\\s+").length;

        }



        public static void readUsingFileReader(String path) throws Exception{  
            long start=System.currentTimeMillis();
          
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                count=countWords(line,count);
            }
            br.close();
            long end=System.currentTimeMillis();

            System.out.println("fileReader word count "+count);
            System.out.println("fileReader time: "+(end-start)+" ms");
        }


        public static void readUsinhInputStreamReader(String path) throws Exception{
            long start=System.currentTimeMillis();
           
          
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path),StandardCharsets.UTF_8));
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                count=countWords(line,count);
            }

            br.close();
            long end=System.currentTimeMillis();

            System.out.println("inputStreamReader word count "+count);
            System.out.println("inputStreamReader time: "+(end-start)+" ms");
        }

        public static void main(String args[]){ 
            try{
                System.out.println("----StringBuilder vs StringBuffer----");
                compareStringBuilderAndStringBuffer();

                System.out.println("----FileReader vs InputStreamReader----");
                String filepath="file.txt";
                readUsingFileReader(filepath);
                readUsinhInputStreamReader(filepath);

            }catch(Exception e){
                System.out.println(e.getMessage());

            }
        }






    }



