

import java.nio.charset.StandardCharsets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class ByteStreamConversionToCharacterStream {


    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        String filePath="file.txt";
        String target="hello";

        int count=0;

        try{
            FileInputStream fis=new FileInputStream(filePath);
            InputStreamReader isr=new InputStreamReader(fis,StandardCharsets.UTF_8);

          
            BufferedReader br=new BufferedReader(isr);


            String line;
            System.out.println("file content:");


            while((line=br.readLine())!=null){
                // String[] words=line.split("\\s+");
                // for(String word:words){
                //     if(word.equalsIgnoreCase(target)){
                //         count++;
                //     }
                // }
                System.out.println(line);
            }

            br.close();
            fis.close();
            isr.close();
            fis.close();


           // System.out.println("count: "+count);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }


}
