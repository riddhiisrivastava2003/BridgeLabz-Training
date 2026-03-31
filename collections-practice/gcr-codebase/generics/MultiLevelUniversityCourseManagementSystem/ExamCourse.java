public class ExamCourse extends CourseType{
    public ExamCourse(String courseName){
        super(courseName);
    }

    @Override

    public void evaluationmethod(){
        System.out.println(getCourseName()+" evaluated by exam");
    }
}
