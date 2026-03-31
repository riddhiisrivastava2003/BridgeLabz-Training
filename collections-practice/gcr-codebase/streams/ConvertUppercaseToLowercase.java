import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertUppercaseToLowercase{

    public static void main(String args[]){

        String inputFile="file.txt";
        String outputFile="output.txt";

        try(
            FileReader fr=new FileReader(inputFile,StandardCharsets.UTF_8);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(outputFile,StandardCharsets.UTF_8);
            BufferedWriter bw=new BufferedWriter(fw);
        )
        {
            String line;
            while((line=br.readLine())!=null){
                line=line.toLowerCase();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("file converted successfully");
        }
        catch(IOException e){
            System.out.println("error "+e.getMessage());

        }

        

    }
}