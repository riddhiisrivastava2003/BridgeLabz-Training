

import java.nio.charset.StandardCharsets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;

public class ConsoleToFileUsingInputStream {


    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        String filePath="file.txt";
       // String target="hello";

        //int count=0;

        try{
//FileInputStream fis=new FileInputStream(filePath);
            InputStreamReader isr=new InputStreamReader(System.in);
            FileWriter fw=new FileWriter(filePath);

          
            BufferedReader br=new BufferedReader(isr);


           
            System.out.println("enter text(type exit to stop):");
             String inputtext;

            while(true){
                // String[] words=line.split("\\s+");
                // for(String word:words){
                //     if(word.equalsIgnoreCase(target)){
                //         count++;
                //     }
                // }

                inputtext=br.readLine();
                if(inputtext.equalsIgnoreCase("exit")){
                    break;
                }
               fw.write(inputtext+"\n");
            }

            br.close();
            //fis.close();
            isr.close();
            fw.close();


           // System.out.println("count: "+count);

           System.out.println("data added to the file");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }


}
