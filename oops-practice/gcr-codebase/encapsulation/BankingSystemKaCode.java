import java.util.*;

interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();

}

abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }
    public String getAccountNumber(){
        return accountNumber;

    }

    public String getHolderName(){
        return holderName;

    }
    public double getBalance(){
        return balance;
    }

 
    public void deposit (double amount ){
        if(amount > 0){
            balance += amount;


            System.out.println("amount deposited successfully!!!!");

        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){

            balance -= amount;

            System.out.println("amount withdrawn successfully!!");

        }else{
            System.out.println("insufficient balance or invalid amount");

        }
    }

    public abstract double calculateInterest();

}

class SavingsAccount extends BankAccount implements Loanable{

    public SavingsAccount(String accountNumber, String holderName, double balance){

        super(accountNumber,holderName,balance);
    }

    public double calculateInterest(){

        return getBalance() * 0.04;
    }
    public void applyForLoan(){
        System.out.println("loan applied under saving account");
    }
    public double calculateLoanEligibility(){

        return getBalance() * 5;
    }
}


class CurrentAccount extends BankAccount implements Loanable{

    public CurrentAccount(String accountNumber, String holderName, double balance){

        super(accountNumber, holderName , balance);
    }

     @Override
    public double calculateInterest(){
        return getBalance() * 0.02; 
    }

    
    public void applyForLoan(){
        System.out.println("loan applied under current account");
    }

    
    public double calculateLoanEligibility(){
        return getBalance() * 3;
    }


}


public class BankingSystemKaCode{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<BankAccount> accountList = new ArrayList();
        
        System.out.println("enter no. of accounts: ");

        int totalAccounts = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <= totalAccounts; i++){

            System.out.println("\naccount " + i);
            System.out.println("1. savings account");

            System.out.println("2. current account");
            System.out.print("choose account type: ");

            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("enter account number: ");

            String accNo = sc.nextLine();

            System.out.print("enter account holder name: ");
            String name = sc.nextLine();

            System.out.print("wnter initial balance: ");
            double balance = sc.nextDouble();

            BankAccount account = null;

            if (choice == 1){

                account = new SavingsAccount(accNo,name,balance);

            } else if (choice == 2){

                account = new CurrentAccount(accNo, name, balance);
            } else{

                System.out.println("Invalid account type!");
                continue;
            }

            accountList.add(account);
        }

   
        System.out.println("----Account Details----");

        for (BankAccount account : accountList){

            System.out.println("\naccount number: " + account.getAccountNumber());
            System.out.println("holder name  : " + account.getHolderName());
            System.out.println("balance: " + account.getBalance());

            double interest = account.calculateInterest();
            System.out.println("interest: " + interest);

            if (account instanceof Loanable){


                Loanable loanAccount = (Loanable) account;

                loanAccount.applyForLoan();
                System.out.println("loan eligibility: " +
                        loanAccount.calculateLoanEligibility());
            }

            System.out.println();
        }


        
    }
}