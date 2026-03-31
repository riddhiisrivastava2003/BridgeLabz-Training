import java.util.Scanner;

class TextAnalyzer {
    private String paragraph;

    public TextAnalyzer(String paragraph) {


        this.paragraph = paragraph;
    }

 
    public boolean isEmpty() {

        return paragraph == null || paragraph.trim().isEmpty();
    }


    public int countWords() {
        if (isEmpty()) {
            
            return 0;
        }
        String[] words = paragraph.trim().split("\\s+");

        return words.length;
    }


    public String findLongestWord() {
        if (isEmpty()) {
            return "No words found";
        }

        String[] words = paragraph.trim().split("\\s+");

        String longest = words[0];

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // remove punctuation
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public String replaceWord(String oldWord, String newWord) {
        if (isEmpty()) {
            return paragraph;
        }

        return paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }
}

public class ParagraphAnalysisApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("enter paragraph: ");
        String paragraph = sc.nextLine();

        TextAnalyzer analyzer = new TextAnalyzer(paragraph);

        if (analyzer.isEmpty()) {

            System.out.println("\nparagraph is empty or contains only spaces ");
            return;
        }

        System.out.println("\nword count: " + analyzer.countWords());

        System.out.println("longest word: " + analyzer.findLongestWord());

 
        System.out.print("\nenter word to replace: ");
        String oldWord = sc.next();

        System.out.print("enter new word: ");
        String newWord = sc.next();

        String updatedParagraph = analyzer.replaceWord(oldWord, newWord);

        System.out.println("\nupdated paragraph:");

        System.out.println(updatedParagraph);


       
    }
}
