public class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName){
        super(courseName);
    }

    @Override

    public void evaluationmethod(){
        System.out.println(getCourseName()+" evaluated by reasearch");
    }
}