import java.time.LocalDate;
import java.util.*;

public class CourseEnrollmentApp{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        EnrollmentService service=new EnrollmentService();
        int choice;

        do{

            System.out.println("1. Add Enrollment");
            System.out.println("2. Filter by Course");
            System.out.println("3. Filter by Category");
            System.out.println("4. Group by Course");
            System.out.println("5. Count per Category");
            System.out.println("6. Sort by Date");
            System.out.println("0. Exit");

            choice=sc.nextInt();
            sc.nextLine();

            try{

                switch(choice){

                    case 1:
                        System.out.println("Enter student name: ");
                        String student=sc.nextLine();

                        System.out.println("Enter course name: ");
                        String course=sc.nextLine();

                         System.out.println("Enter category: ");
                        String category=sc.nextLine();

                         System.out.println("Enter enrollment date: ");

                         LocalDate date=LocalDate.parse(sc.nextLine());


                         ValidateUtil.validate(student,course,category,date);
                         service.addEnrollment(new Enrollment(student,course,category,date));
                         System.out.println("Enrollment added");
                         break;


                         case 2:

                         System.out.println("Enter Course Name: ");
                         service.filterByCourse(sc.nextLine());
                         break;
                        
                         case 3:

                          System.out.println("Enter Category: ");
                         service.filterByCategory(sc.nextLine());
                         break;

                         case 4:
                            service.groupByCourse();
                            break;


                            case 5:
                                service.countByCategory();
                                break;

                                case 6:
                                    service.sortByDate();
                                    break;
                                    case 0:
                                        System.out.println("Exiting..");
                                        break;

                                        default:
                                            System.out.println("Invalid choice");


                }


            }
            catch(InvalidEnrollmentException e){
                System.out.println("Valiation error: "+e.getMessage());

            }

            catch(Exception e){
                System.out.println("Error: Invalid input format");
            }
            

        }
        while(choice !=0);
    }
}