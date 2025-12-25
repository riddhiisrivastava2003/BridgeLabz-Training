import java.util.*;

public  class StudentResult{

    static  Random random=new Random();

    static int[][] generationOfScores(int students){
        int[][] scores=new int[students][3];

        for(int i=0;i<students;i++){
            scores[i][0]=random.nextInt(90)+10;
            scores[i][1]=random.nextInt(90)+10;
            scores[i][2]=random.nextInt(90)+10;
                }
                return scores;
    }

    static double [][] calculateResult(int[][] scores){
        int students=scores.length;
        double[][] results=new double[students][3];

        for(int i=0;i<students;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;

            results[i][0]=Math.round(total*100.0)/100.0;
            results[i][1]=Math.round(average*100.0)/100.0;
            results[i][2]=Math.round(percentage*100.0)/100.0;

        }
        return results;
    }

    static void display(int[][] scores,double[][] results){
        System.out.println("student\tphysics\tchemistry\tmaths\ttotal\taverage\tpercentage");

        for(int i=0;i<scores.length;i++){
            System.out.println(
                (i+1)+"\t\t"+
                scores[i][0]+"\t\t"+
                scores[i][1]+"\t\t"+
                scores[i][2]+"\t"+
                scores[i][0]+"\t"+
                scores[i][1]+"\t"+
                scores[i][2]
            );
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter students");
        int students=sc.nextInt();

        int[][] scores=generationOfScores(students);
        double[][] results=calculateResult(scores);

        System.out.println("results");
        display(scores, results);
    }
}
    