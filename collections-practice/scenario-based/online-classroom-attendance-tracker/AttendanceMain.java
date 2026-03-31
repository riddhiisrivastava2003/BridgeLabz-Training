import java.util.*;

public class AttendanceMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        AttendanceLogic service=new AttendanceLogic();

        while(true){
            System.out.println("1. Mark Attendance");
            System.out.println("2. Remove Attendance");
            System.out.println("3. Display Attendance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice=sc.nextInt();
            sc.nextLine();

            

            try{
            switch(choice){
                case 1:
                    System.out.print("Enter Session Id: ");
                     String sessionId=sc.nextLine();
                    System.out.print("Enter student Id: ");
                    String studentId=sc.nextLine();
                    service.markAttendance(sessionId,studentId);
                    break;
                case 2:
                    System.out.print("Enter Session Id: ");
                     sessionId=sc.nextLine();
                    System.out.print("Enter student id: ");
                    studentId=sc.nextLine();
                    service.removeAttendance(sessionId,studentId);
                    break;   
                case 3:
                    System.out.print("Enter Session Id: ");
                     sessionId=sc.nextLine();
                    service.displayAttendance(sessionId);  
                    break;   
                case 4:
                    System.out.println("System exiting..");
                    sc.close();
                    return;    
                default:
                    System.out.println("Invalid input");
                    return;    

            }
        }catch(DuplicateAttendanceException e){
            System.err.println(e.getMessage());
        }
        }
    }
}