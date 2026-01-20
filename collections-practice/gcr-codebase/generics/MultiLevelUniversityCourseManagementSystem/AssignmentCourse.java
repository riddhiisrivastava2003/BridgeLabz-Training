
public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName){
        super(courseName);
    }

    @Override

    public void evaluationmethod(){
        System.out.println(getCourseName()+" evaluated by assignment");
    }
}
