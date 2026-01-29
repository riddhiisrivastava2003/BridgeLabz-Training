import java.util.*;

public class IpValidator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter ip address: ");
        String ip=sc.nextLine();

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        
        if(ip.matches(regex)){
            System.out.println("valid ip address");
        }
        else{
            System.err.println("invalid ip address");
        }
    }
}