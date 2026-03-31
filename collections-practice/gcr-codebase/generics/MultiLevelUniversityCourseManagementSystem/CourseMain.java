import java.util.*;

public class CourseMain{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<CourseType> allcourses=new ArrayList<>();

        while(true){
            System.out.println("1. add assignment course");
            System.out.println("2. add exam course");
            System.out.println("3. add research course");
            System.out.println("4. display all courses");
            System.out.println("5. exit");

            int choice=sc.nextInt();

            sc.nextLine();

            if(choice>=1 && choice<=3){
                System.out.println("enter course name");
                String courseName=sc.nextLine();
                CourseType course=null;
                if(choice==1){
                   course=new AssignmentCourse(courseName);
                
                }
                else if(choice==2){
                    course=new ExamCourse(courseName);
                }
                else if(choice==3){
                    course=new ResearchCourse(courseName);
                }
                Course<CourseType> c=new Course<>(course);
                c.showCourseDetails();
                allcourses.add(course);
            }

            else if(choice==4){
                if(allcourses.isEmpty()){
                    System.out.println("no courses added yet");
                    
                }else{

                CourseManager.displayAllCourse(allcourses);
            }
            }
            else if(choice==5){
                break;

            }

            else{
                System.out.println("invalid choice");
            }



        }

        
    }
}