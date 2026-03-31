
import java.util.*;
class InvalidMarkException extends Exception{
    public InvalidMarkException(String message){
        super(message);
    }
}

class Student{
    String studentName;
    String[] subjects;
    int[] marks;

    Student(String studentName, String[] subjects, int[] marks){
        this.studentName = studentName;

        this.subjects = subjects;
        this.marks = marks;

    }

    double calculateAverage(){
        int total = 0;
        for(int mark : marks){

            total+= mark;

        }
        return (double) total / marks.length;
    }

    String assignGrade(double average){
        if (average >= 90)  return "A";
        else if (average >= 75) return  "B";
        else if (average >= 60 ) return "C";
        else if (average >= 50 ) return "D";

        else return "F";
        
    }

    void displayReport(){
        double average = calculateAverage();
        String grade = assignGrade(average);

        System.out.println();
        System.out.println("student name: "+ studentName);
        System.out.println("subjects and marks:");




        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  " +subjects[i] + " : "  + marks[i]);
        }




        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade : " + grade);
        System.out.println();

    }

}



public class StudentReportGenerator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Student > studentList = new ArrayList<>();


        System.out.println("enter no. of students: ");
        int studentCount = sc.nextInt();

        sc.nextLine();
        for(int i = 1; i<=studentCount;i++){
            try {
                System.out.println("enter details for student: " + i);

                System.out.print("student name: ");
                String name = sc.nextLine();


                System.out.print("number of subjects: ");
                int subjectCount = sc.nextInt();
                sc.nextLine();

                String[] subjects = new String[subjectCount];

                int[] marks = new int[subjectCount];

                for (int j = 0; j < subjectCount; j++){
                    System.out.print("enter subject name: ");
                    subjects[j] = sc.nextLine();

                    System.out.print("enter marsk(0-100): ");

                    int enteredMarks = sc.nextInt();
                    sc.nextLine();

                    if (enteredMarks < 0 || enteredMarks > 100){
                        throw new InvalidMarkException("invalid marks!!!!");
                    }
                    marks[j] =  enteredMarks;
                }
                Student student = new Student( name , subjects, marks);

                studentList.add(student);

                    
                
            } 
            catch (InvalidMarkException e){

                System.out.println("Error " + e.getMessage());
                i--;
            }
           
        }
         System.out.println("reslt");


        for (Student student : studentList){

            student.displayReport();
        }


    }
}