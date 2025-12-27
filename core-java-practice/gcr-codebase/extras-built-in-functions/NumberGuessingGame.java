import java.util.*;
public class NumberGuessingGame{

    public static int guessGenerator(int low,int high){
        Random rand=new Random();
        return rand.nextInt(high-low+1)+low;
    }

    public static char gettingFeedback(Scanner sc){
        System.out.println("enter the feedback (H=high, L=low, C=correct)");
        return sc.next().charAt(0);
    }
public static void updateRange(char feedback, int guess, int[] range){
        if(feedback=='H'|| feedback=='h'){
            range[1]=guess-1;
        }
        else if(feedback=='L' || feedback=='l'){
            range[0]=guess+1;
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int[] range={1,100};
        char feedback;

        System.out.println("think of a number between 1 to 100");

        do{
            int guess=guessGenerator(range[0],range[1]);
            System.out.println("computer guess "+guess);

            feedback=gettingFeedback(sc);
            updateRange(feedback,guess,range);


        }

        while(feedback !='C' && feedback !='c');

        System.out.println("computer guessed the correct number!!!");
    }
}