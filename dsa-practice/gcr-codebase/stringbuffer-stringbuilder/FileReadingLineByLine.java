

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileReadingLineByLine {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String filePath="file.txt";

        try{
            FileReader f=new FileReader(filePath);
            BufferedReader br=new BufferedReader(f);

            String line;
            System.out.println("file content:");

            while((line = br.readLine())!=null){
                System.out.println(line);
            }

            br.close();
            f.close();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }



}
