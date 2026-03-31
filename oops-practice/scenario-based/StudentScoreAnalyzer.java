import java.util.*;
class InvalidScoreException extends Exception{
    public InvalidScoreException(String message){
        super(message);
    }
    
}


public class StudentScoreAnalyzer{
    public static void validateScores(int[] scores) throws InvalidScoreException{
        for(int score : scores){
            if(score < 0 || score > 100){
                throw new InvalidScoreException("Invalid score");
            }
        }
    
    }


    public static double calculateAverage(int[] scores){
        int sum = 0;
        for(int score : scores){


            sum += score;
        }
        return (double)sum / scores.length;
    }


    public static int findMax(int[] scores){
            int max=scores[0];
            for(int score : scores){
                if(score > max){
                    max = score;
                }
            }
            
            return max;
        }


        public static int findMin(int[] scores){
            int min=scores[0];
            for(int score : scores){
                if(score < min){
                    min = score;
                }
            }
            
            return min;
        }



        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
                System.out.println("enter number of students");
                int n=sc.nextInt();

                    int[] scores=new int[n];
                    System.out.println("enter scores");
                    for(int i=0;i<n;i++){
                        scores[i]=sc.nextInt();
                    }   

                    try{
                        validateScores(scores);

                        System.out.println("average score is "+calculateAverage(scores));
                        
                        System.out.println("max score is "+findMax(scores));

                        System.out.println("min score is "+findMin(scores));
                    }
                    catch(InvalidScoreException e){


                        System.out.println(e.getMessage()); 

                    }

        }
}