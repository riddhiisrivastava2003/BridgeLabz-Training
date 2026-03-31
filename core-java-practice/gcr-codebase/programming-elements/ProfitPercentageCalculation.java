import java.util.*;
public class ProfitPercentCalcuation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int costPrice=129;
        int sellingPrice=191;
         double profit=sellingPrice-costPrice;
         double profitPercentage=(profit/costPrice)*100;
         System.out.println("The cost price is INR "+costPrice+ " and selling price is INR "+sellingPrice+"\n"+
                                "The profit is INR"+profit+" and the profit percentage is "+profitPercentage);
         
    }
}