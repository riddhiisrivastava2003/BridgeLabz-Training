import java.util.*;

public class LicensePlateValidator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter licence plate: ");
        String licence=sc.nextLine();

        if(licence.matches("^[A-Z]{2}\\d{4}$")){
            System.out.println("valid licence plate");
        }
        else{
            System.err.println("invalid licence plate");
        }
    }
}