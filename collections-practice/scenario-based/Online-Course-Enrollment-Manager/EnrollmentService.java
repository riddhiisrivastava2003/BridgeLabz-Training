import java.util.*;
import java.util.stream.Collectors;


public class EnrollmentService{

    private List<Enrollment> enrollments=new ArrayList<>();

    public void addEnrollment(Enrollment enrollment){

        enrollments.add(enrollment);
    }


    public void filterByCourse(String course){
        enrollments.stream()
        .filter(e->e.getCourseName().equalsIgnoreCase(course))
        .forEach(System.out::println);
    }

    public void filterByCategory(String category){
        enrollments.stream()
        .filter(e->e.getCourseCategory().equalsIgnoreCase(category))
        .forEach(System.out::println);
    }

    public void groupByCourse(){
        Map<String ,List<Enrollment>> map=
        enrollments.stream()
        .collect(Collectors.groupingBy(Enrollment::getCourseName));

        map.forEach((k,v)->{
            System.out.println(k);
            v.forEach(e->System.out.println(" "+e));
        });
        
        }

        public void countByCategory(){
            Map<String, Long> count=
            enrollments.stream()
            .collect(Collectors.groupingBy(
                Enrollment::getCourseCategory,Collectors.counting()
            ));


            count.forEach((k,v)->System.out.println(k+"->"+v));
        }


        public void sortByDate(){

            enrollments.stream()
            .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
            .forEach(System.out::println);
        }

        public boolean isEmpty(){
            return enrollments.isEmpty();
        }
    }
