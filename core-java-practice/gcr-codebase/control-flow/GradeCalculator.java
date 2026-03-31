import java.util.*;
public class GradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int physics=sc.nextInt();
        int maths=sc.nextInt();
        int chemistry=sc.nextInt();

        double average=(physics+chemistry+maths)/3.0;

        String grade;
        String remarks;

        if(average>=80){
            grade="A";
            remarks="Level 4,above agency-normalized standards";
        }
        else if(average>=70 && average<=79){
            grade="B";
            remarks="Level 3, at agency-normalized standards";}

            else if(average>=60 && average<=69){
                grade="C";
                remarks="Level 2, below but approaching agency-normalized standards";
            }
            else if(average>=50 && average<=59){
                    grade="D";
                    remarks="Level 1, well below agency-normalized standards";
            }
            else if(average>=40){
                grade="E";
                remarks="Level 1-, too below agency-normalized standards";
            }
            else{
                grade="R";
                remarks="Remidia Reminder";
            }

            System.out.printf("Average Marks %.2f",average);
            System.out.println("Grade "+grade);
            System.out.println("Remarks "+remarks);

    }
}