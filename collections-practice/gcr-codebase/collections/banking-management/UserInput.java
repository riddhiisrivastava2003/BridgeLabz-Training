import java.util.*;

public class UserInput{

    private BankManager manager=new BankManager();
    private Scanner sc=new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("1. add account");
            System.out.println("2. request withdrawal");
            System.out.println("3. process withdrawal requests");
            System.out.println("4. display accounts");
            System.out.println("5. display accounts sorted by balance");
            System.out.println("6. exit");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("enter account number");
                    int accountNumber=sc.nextInt();
                    System.out.println("enter balance");
                    double balance=sc.nextDouble();
                    manager.createAccount(accountNumber,balance);
                    break;
                case 2:
                    System.out.println("enter account number");
                    accountNumber=sc.nextInt();
                    System.out.println("enter amount");
                    double amount=sc.nextDouble();
                    manager.requestWithdrawal(accountNumber,amount);
                    break;
                case 3:
                    manager.processWithdrawalRequests();
                    break;
                case 4:
                    manager.displayAccounts();
                    break;
                case 5:
                    manager.displaySortedByBalance();
                    break;
                case 6:
                    return  ;
                default:
                    System.out.println("invalid choice");
            }

        }
    }
}