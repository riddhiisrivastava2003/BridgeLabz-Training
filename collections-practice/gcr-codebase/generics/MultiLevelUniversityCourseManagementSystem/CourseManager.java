import java.util.*;

public class CourseManager{

    public static void  displayAllCourse(List<? extends CourseType> courseList){

        for(CourseType course : courseList){
            System.out.println(course.getCourseName());
       // courseList.evaluationmethod();
        }
    }
     
}