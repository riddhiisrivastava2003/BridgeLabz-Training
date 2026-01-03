import java.util.*;

class Course{
    String courseName;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName ;
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("course name: " + courseName );
        System.out.println("course duration in hours: " + duration );

    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName , duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("platform: " + platform);

        System.out.println("recorded courses " + (isRecorded ? "Yes ":" No"));

    }

}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;

        this.discount = discount;
    }

    //Overriding 
    void displayDetails(){
        super.displayDetails();
        System.out.println("course fee: " +fee);
        System.out.println("discount :" +discount);

        System.out.println("final payable amount " + calculateFinalfee());

    }

    double calculateFinalfee(){
        return fee - (fee * discount / 100);

    }

}

public class Education {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter course name ");
        String courseName = sc.nextLine();

        System.out.println("enter course duration (in hours):  ");
        int duration  = sc.nextInt();

        sc.nextLine();

        System.out.println("enter online platform ");
        String platform = sc.nextLine();

        System.out.println("is the course recorded?(true/false): ");
        boolean isRecorded = sc.nextBoolean();

        System.out.println("enter course fee : ");
        double fee = sc.nextDouble();

        System.out.println("enter discount  : ");
        double discount  = sc.nextDouble();

        PaidOnlineCourse course = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);

        System.out.println(" Course details ");
        course.displayDetails();
    }
    
}