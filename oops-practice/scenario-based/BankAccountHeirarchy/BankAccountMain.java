import java.util.*;

public class BankAccountMain{

    public static void main(String args[]){

        BankAccount savings=new SavingsAccount("12345",10000.0);
       // System.out.printf("sample output: %.2f%n",savings.calculateFee());

        Scanner sc=new Scanner(System.in);

        System.out.println("choose acc type:");
        System.out.println("1. savings");
        System.out.println("2. checking");
        int type=sc.nextInt();
        sc.nextLine();

        System.out.println("enter acc no.: ");
        String accno=sc.nextLine();

        System.out.println("enter balance: ");
        double balance=sc.nextDouble();


        BankAccount account;
        if(type==1){
            account=new SavingsAccount(accno,balance);
        }
        else if(type==2){
            account=new CheckingAccount(accno,balance);
        }
        else{
            System.out.println("invalid acc type");
            return;
        }

        System.out.printf("fee: %.2f%n",account.calculateFee());
        sc.close();
    






    }
}