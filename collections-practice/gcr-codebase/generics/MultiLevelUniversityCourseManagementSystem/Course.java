public class Course<T extends CourseType>{
    private T course;

    public Course(T course){
        this.course = course;
    }

    public void showCourseDetails(){
        System.out.println("Course Name: "+course.getCourseName());
        course.evaluationmethod();
    
    }
    public T getCourseName(){
        return course;
    }

    }
