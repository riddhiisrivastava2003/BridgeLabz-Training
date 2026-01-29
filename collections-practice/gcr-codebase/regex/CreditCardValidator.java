import java.util.*;

public class CreditCardValidator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter credit card number: ");
        String card=sc.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        if(card.matches(regex)){
            if(card.startsWith("4")){
                System.out.println("valid visa card");
            }
            else{
                System.out.println("valid mastercard");
            }
        }
        else{
            System.err.println("invalid credit card number");
        }


    }
}