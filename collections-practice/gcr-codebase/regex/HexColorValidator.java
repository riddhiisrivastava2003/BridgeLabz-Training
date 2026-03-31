import java.util.*;

public class HexColorValidator{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter hex color: ");
        String hex=sc.nextLine();

        if(hex.matches("^#[0-9A-Fa-f]{6}$")){
            System.out.println("valid hex color");
        }
        else{
            System.err.println("invalid hex color");
        }
    }
    }
