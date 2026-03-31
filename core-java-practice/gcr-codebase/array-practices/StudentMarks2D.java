import java.util.*;

public class StudentMarks2D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of students ");
        int n=sc.nextInt();

        double[][] marks=new double[n][3];
        double[] percentage=new double[n];
        char[] grade=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.print("Physics ");
            marks[i][0]=sc.nextDouble();
            System.out.print("Chemistry ");
            marks[i][1]=sc.nextDouble();
            System.out.print("Maths ");
            marks[i][2]=sc.nextDouble();

            
        }
        for(int i=0;i<n;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;

            if(percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70 && percentage[i]<=79) grade[i]='B';
            else if(percentage[i]>=60 && percentage[i]<=69) grade[i]='C';
            else if(percentage[i]>=50 && percentage[i]<=59) grade[i]='D';
            else if(percentage[i]>=40 && percentage[i]<=49) grade[i]='E';
            else grade[i]='R';

        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Percentage "+percentage[i]);
            System.out.println("grade "+grade[i]);
        }
    }
    
}