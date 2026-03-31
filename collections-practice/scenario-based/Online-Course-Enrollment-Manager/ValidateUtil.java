import java.time.LocalDate;


public class ValidateUtil{

    public static void validate(String student, String course, String category, LocalDate date) throws InvalidEnrollmentException{

        if(student==null || student.trim().isEmpty())
            throw new InvalidEnrollmentException("Student name cannot be empty");

        if(course==null || course.trim().isEmpty())
            throw new InvalidEnrollmentException("Course name cannot be empty");


            if(category==null || category.trim().isEmpty())
            throw new InvalidEnrollmentException("Course category cannot be empty");


            if(date.isAfter(LocalDate.now()))
            throw new InvalidEnrollmentException("Enrollment Date is invalid");    

    }
}