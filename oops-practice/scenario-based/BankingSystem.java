import java.util.*;


//excpetion handling 
class InsufficietBalanceException extends Exception{
    public InsufficietBalanceException(String msg){
        super(msg);
    }
}



//abstraction 

interface BankService{
    void deposit(double amount);
    void withdraw(double amount) throws InsufficietBalanceException;
    double calculateInterest();


}




//base class

abstract class Account implements BankService{

    int accountNumber;
    String holderName;
    double balance;
    List<String > transactions=new ArrayList<>();



    Account(int accountNumber, String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;


        transactions.add("Account opened with Rs. "+balance);



    }



    public synchronized void deposit(double amount){

        balance=balance+amount;
        transactions.add("deposited: Rs. "+amount);
    }



    public synchronized void withdraw(double amount)
        throws InsufficietBalanceException{
            if(amount>balance){
                throw new InsufficietBalanceException("insufficient balance");

            }
            balance=balance-amount;
            transactions.add("withdrawn: Rs. "+amount);
        }


        void showBalance(){
            System.out.println("balance: Rs. "+balance);
        }



        void showTransactions(){
            for(String s:transactions){
                System.out.println(s);
            }
        }

}
    
        //savings account


        class SavingsAccount extends Account{

            SavingsAccount(int accountNumber, String holderName,double balance){
                super(accountNumber,holderName,balance);
            }

            public double calculateInterest(){
                return balance*0.04;
            }
        }



        //current account

        class CurrentAccount extends Account{

            CurrentAccount(int accountNumber,String holderName,double balance){
                super(accountNumber,holderName,balance);
            }

            public double calculateInterest(){
                return balance*0.01;
            }
        }



        //multithreading


        class TransferThread extends Thread{

            Account from, to;
            double amount;


            TransferThread(Account from, Account to, double amount){
                this.from=from;
                this.to=to;
                this.amount=amount;
            }

            public void run(){
                synchronized(Account.class){
                    try{
                        from.withdraw(amount);
                        to.deposit(amount);
                        System.out.println("Rs. "+amount+"transferred successfully");
                    }
                    catch (InsufficietBalanceException e){
                        System.out.println(e.getMessage());


                    }
                }
            }
        }
//main class


public class BankingSystem{
    public static Scanner sc=new Scanner(System.in);
    static List<Account> accounts=new ArrayList<>();


    static Account findAccount(int accNo){
        for(Account a:accounts)
            if(a.accountNumber==accNo)
                return a;
        
        return null;    
        }


    //cfreat


    public static void createAccount(){
        System.out.print("account no.: ");
        int accNo=sc.nextInt();
        sc.nextLine();


        System.out.print("holder name: ");
        String name=sc.nextLine();

        System.out.print("initial balance: ");
        double bal=sc.nextDouble();

        System.out.print("1. savings account  2. current account");
        int type=sc.nextInt();


        Account acc=(type==1)? new SavingsAccount(accNo,name,bal): new CurrentAccount(accNo,name,bal);



        accounts.add(acc);
        System.out.println("account created");
    }


    //read

    public static void viewAllAccounts(){
        System.out.println("----all accounts----");
         for(Account a: accounts)
            System.out.println(a.accountNumber+"      "+a.holderName+"      Rs. "+a.balance);
    }



    public static void checkBalance(){

        System.out.print("account number:");
        int acc=sc.nextInt();

        Account a=findAccount(acc);

        if(a!=null) a.showBalance();

        else System.out.println("account not found");
    }


    //update

    static void depositMoney(){
        System.out.print("account number: ");
        int acc=sc.nextInt();
        System.out.print("amount: ");
        double amt=sc.nextDouble();


        Account a=findAccount(acc);

        if(a!=null){
            a.deposit(amt);
            System.out.println("deposit sucessfull");
        }

        else{
            System.out.println("account not found");
        }
    }


    public static void withdrawMoney(){

        System.out.print("account number: ");
        int acc=sc.nextInt();
        System.out.print("amount: ");
        double amt=sc.nextDouble();


        Account a=findAccount(acc);


        try{
            if(a!=null){
                a.withdraw(amt);
                System.out.println("withdrawn successfull");
            }
        }
        catch (InsufficietBalanceException e){
            System.out.println(e.getMessage());
        }
    }




    //delete

    public static void deleteAccount(){

        System.out.print("account number to delete: ");
        int acc=sc.nextInt();
        accounts.removeIf(a->a.accountNumber==acc);
        System.out.println("account deleted");
    }



    //transfer

    static void transferMoney(){
        System.out.print("from acc: ");
        int from=sc.nextInt();
         System.out.print("to acc: ");
        int to=sc.nextInt();

         System.out.print("amount: ");
        int amt=sc.nextInt();


        Account a1=findAccount(from);
        Account a2=findAccount(to);



        if(a1 !=null && a2 !=null)
            new TransferThread(a1,a2,amt).start();
        else
            System.out.println("account not found");
    


      }  //menu


        public static void main(String args[]){

            int ch;
            do{
                System.out.println("----online banking system----");
                System.out.println("1. create account");
                System.out.println("2. view all account");
                System.out.println("3. check balance");
                System.out.println("4. deposit ");
                System.out.println("5. withdraw");
                System.out.println("6. transfer money");
                System.out.println("7. transaction history");
                System.out.println("8. delete account");
                System.out.println("9. calculate interest");
                System.out.println("0. exit");
                System.out.println("enter your choice: ");
                ch=sc.nextInt();

                switch(ch){
                    case 1->createAccount();
                    case 2->viewAllAccounts();
                    case 3->checkBalance();
                    case 4->depositMoney();
                    case 5->withdrawMoney();
                    case 6->transferMoney();

                    case 7->{
                        System.out.println("account number: ");
                        int acc=sc.nextInt();
                        Account a=findAccount(acc);
                        if(a!=null) a.showTransactions();
                    }

                    case 8->deleteAccount();

                    case 9->{
                        System.out.print("account number: ");
                        int acc=sc.nextInt();
                        Account a=findAccount(acc);
                        if(a!=null){
                            System.out.println("interest: Rs. "+a.calculateInterest());
                        }
                    }

                    case 0->System.out.println("thank you");
                    default->System.out.println("invalid choice");
                }
            }

                while(ch !=0);

            }
        }


    
    



