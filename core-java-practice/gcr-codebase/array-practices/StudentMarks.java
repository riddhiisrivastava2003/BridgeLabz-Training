import java.util.*;
public class StudentMarks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter students number");
        int n=sc.nextInt();

        double[] physics=new double[n];
        double[] chemistry=new double[n];
        double[] maths=new double[n];
        double[] percentage=new double[n];
        char[] grade=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));

            System.out.print("Physics ");
            physics[i]=sc.nextDouble();
            System.out.print("Chemistry ");
            chemistry[i]=sc.nextDouble();
            System.out.print("Maths ");
            maths[i]=sc.nextDouble();

            if(physics[i]<0||chemistry[i]<0||maths[i]<0){
                System.out.println("invalid input");
                i--;
            }
        }

        for(int i=0;i<n;i++){
            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3;

            if(percentage[i]>=90) grade[i]='A';
            else if (percentage[i] >=75) grade[i]='B';
            else if (percentage[i]>=60) grade[i]='C';
            else grade[i]='D';
        }

        for(int i=0;i<n;i++){
            System.out.println("student "+(i+1));
            System.out.println("percentage "+percentage[i]);
            System.out.println("grade "+grade[i]);
            
        }

    }
}