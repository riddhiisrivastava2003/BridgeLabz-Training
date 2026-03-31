import java.util.*;
import java.time.*;

public class LoggingTransactions{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<String> transactions=new ArrayList<>();

        System.out.println("Enter number of transactions: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter transaction id "+(i+1)+" : ");
            String id=sc.nextLine();
            transactions.add(id);
        }

        System.out.println("Transaction logs ");
        transactions.forEach(id->{
            LocalDateTime timestamp=LocalDateTime.now();
            System.out.println("Transaction ID: "+id+" | Logged at: "+timestamp);
        });
    }

}