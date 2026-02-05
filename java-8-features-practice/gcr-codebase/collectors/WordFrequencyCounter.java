import java.util.*;
import java.util.stream.Collectors;
public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph: ");
        String paragraph = sc.nextLine();


       Map<String, Integer> wordCountMap=

                Arrays.stream(paragraph.toLowerCase()
                        .replaceAll("[^a-zA-Z ]","")
                        .split("\\s+"))
                        .filter(word->!word.isEmpty())
                        .collect(Collectors.toMap(
                                word->word,     
                                word->1,Integer::sum));

        System.out.println("\nWord Occurences: ");
        wordCountMap.forEach((word,count)->System.out.println(word+" -> "+count));
       
    }

    
}
