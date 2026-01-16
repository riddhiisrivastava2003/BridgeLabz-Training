


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class AppearanceOfAWord {


    public static void mai(String args[]){
        //Scanner sc=new Scanner(System.in);
        String filePath="file.txt";
        String target="hello";

        int count=0;

        try{
            FileReader f=new FileReader(filePath);
            BufferedReader br=new BufferedReader(f);


            String line;

            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                for(String word:words){
                    if(word.equalsIgnoreCase(target)){
                        count++;
                    }
                }
            }

            br.close();
            f.close();

            System.out.println("count: "+count);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }


}
