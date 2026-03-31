import java.util.*;
public class StudentGradeCalculation{
    static int[][] scoresGeneration(int n){
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
        scores[i][j]=10+(int)(Math.random()*90);
    return scores;
    }

    static double[][] statsCalculation(int[][] s){
        double[][] stats=new double[s.length][3];
        for(int i=0;i<s.length;i++){
            int total=s[i][0]+s[i][1]+s[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;

            stats[i][0]=total;
            stats[i][1]=Math.round(avg*100)/100.0;
            stats[i][2]=Math.round(per*100)/100.0;
        }
        return stats;
    }

    static String[][] calculateGrade(double[][] stats){
        String[][] result=new String[stats.length][2];
        for(int i=0;i<stats.length;i++){
            double p=stats[i][2];

            if(p>=80){result[i][0]="A"; result[i][1]="Level 4(Above standards)";}
            else if(p>=70){result[i][0]="B"; result[i][1]="Level 3(At standards)";}
              if(p>=60){result[i][0]="C"; result[i][1]="Level 2(Approaching standards)";}
               if(p>=50){result[i][0]="D"; result[i][1]="Level 1(Below standards)";}
                if(p>=40){result[i][0]="E"; result[i][1]="Level 1-(Too Below standards)";}
                 else{result[i][0]="R"; result[i][1]="Remedial standards";}
        }
        return result;
    }

    static void display(int[][]s, double [][] st,String[][]g)
    
    {
        System.out.println("Stu Phy Chem Math total Avg  %");
        for(int i=0;i<s.length;i++){
            System.out.println((i+1)+" "+s[i][0]+" "+s[i][1]+" "+s[i][2]+" "+
                                (int)st[i][0]+" "+st[i][1]+" "+st[i][2]+" "+
                            g[i][0]+"  "+g[i][1]);
        }
    }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the sumber of students");
            int n=sc.nextInt();

            int[][] scores=scoresGeneration(n);
            double[][] stats=statsCalculation(scores);
            String[][] grades=calculateGrade(stats);

            display(scores,stats,grades);
        }
    
}