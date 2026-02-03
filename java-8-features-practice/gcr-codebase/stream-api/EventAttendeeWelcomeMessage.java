import java.util.*;

public class EventAttendeeWelcomeMessage{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        List<String> attendees=new ArrayList<>();

        System.out.println("Enter number of attendees: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter attendee name: ");
            String name=sc.nextLine();
            attendees.add(name);

        }

        System.out.println("Welcome Messages: ");
        attendees.forEach(name-> System.out.println("Welcome "+name+" to the Event!"));
      
    }
}