import java.io.*;
import java.util.*;

public class WordFrequencyCounterUsingMap{

    public static void main(String[] args){


        String filePath = "file.txt";
        Map<String, Integer>wordCount =new HashMap<>() ;

        try {
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNext()) {

                String word = fileScanner.next()
                        .toLowerCase()
                        .replaceAll("[^a-z]","") ;

                if (!word.isEmpty()) {


                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1) ;
                }
            }

            fileScanner.close();



            System.out.println("word frequency: "+wordCount);

        } 
        
        catch (FileNotFoundException e) {
            System.out.println("file 'file.txt' not found.....");
        }
    }
}