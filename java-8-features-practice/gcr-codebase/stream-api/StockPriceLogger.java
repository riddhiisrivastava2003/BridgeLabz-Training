import java.util.*;

public class StockPriceLogger{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Double> prices=new ArrayList<>();

        System.out.println("Enter number of stock prices: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter stock price: ");
            double price=sc.nextDouble();
            prices.add(price);
            
        }

        System.out.println();
        System.out.println("Live Stock Prices: ");
        prices.forEach(price->System.out.println("Stock Prices: "+price));

    }
}