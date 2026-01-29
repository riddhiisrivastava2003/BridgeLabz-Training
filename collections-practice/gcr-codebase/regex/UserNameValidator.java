import java.util.*;
public class UserNameValidator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter username: ");
        String username=sc.nextLine();
        
        if(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")){
            System.out.println("valid username");
        }
        else{
            System.err.println("invalid username"); 
        }
    }
}