import java.util.*;
public class InvoiceGenerator{
    public static String[]  parseInvoice(String input){
        return input.split(",");


    }


    public static int totalAmount(String[] str){
        int total=0;

        for(String i:str){
            String[] parts=i.split("-");

            if(parts.length==2){
                String amountPart=parts[1].trim();
                String amountStr=amountPart.split(" ")[0];
                total=total+Integer.parseInt(amountStr);
            }
        }

        return total;
    }


    public static void display(String[] str){
        System.out.println("----invoice details----");
        for(String i:str){
            System.out.println(i.trim());
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter invoice details: ");
       // System.out.println()

       String input=sc.nextLine();

       String[] tasks=parseInvoice(input);

       display(tasks);

       int totalAmt=totalAmount(tasks);

       System.out.println("total invoice amount: "+totalAmt);
    }
}