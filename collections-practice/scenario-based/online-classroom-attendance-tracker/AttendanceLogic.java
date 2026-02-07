import java.util.*;
public class AttendanceLogic{

    private Map<String, Set<String>> attendanceMap=new HashMap<>();

    public void markAttendance(String sessionId, String studentId)
    throws DuplicateAttendanceException{

        attendanceMap.putIfAbsent(sessionId,new HashSet<>());
        Set<String> students=attendanceMap.get(sessionId);

        if(!students.add(studentId)){
            throw new DuplicateAttendanceException(
                "Student "+studentId+" attendance has already been marked."
            );
        }
        System.out.println("Attendance marked successfully");


    }



    public void removeAttendance(String sessionId, String studentId){
        Set<String> students=attendanceMap.get(sessionId);
        if(students !=null && students.remove(studentId)){
            System.out.println("Attendance removed successfully");
        }
        else{
            System.out.println("No attendance found.");
        }
    }

    public void displayAttendance(String sessionId){
        Set<String> students=attendanceMap.get(sessionId);
        if(students==null || students.isEmpty()){
            System.out.println("No attendance found for this session. ");

        }
        else{
            System.out.println("Students present: "+students);
        }
    }
}