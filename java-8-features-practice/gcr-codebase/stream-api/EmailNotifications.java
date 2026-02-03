
import java.util.*;
import java.util.regex.*;

public class EmailNotifications{


    public static boolean isValidEmail(String email){
        String regex= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex,email);


    }

    public static void sendingEmailNotofications(String email){
        System.out.println("Sending email to: "+email+".......Sent");
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        List<String> emails=new ArrayList<>();

        System.out.println("Enter number of emails: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter email: ");
            String email=sc.nextLine();
            if(isValidEmail(email)){
            emails.add(email);
            }else{
                System.out.println("Invalid Email: "+email);
            }
            }
        

        System.out.println("Sending Email Notifications: ");
        emails.forEach(email->sendingEmailNotofications(email));
    }
}