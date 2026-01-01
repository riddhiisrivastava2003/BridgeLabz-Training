

import java.util.*;

class BankAccount{
  

    static String bankName = "BridgeLabz Bank";
    static int totalAccounts = 0;

    final String accountNumber;

    String accountHolderName;
    double balance;

    

    BankAccount(String accountHolderName, String accountNumber,double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance=balance;
        totalAccounts++;

    }
    
    void deposit(double amount) {
    	if(amount>0) {
    		balance =balance+amount;
    		System.out.println("deposited: "+amount);
    	}
    }
    
    void withdraw(double amount) {
    	if(amount>0 && amount<=balance) {
    		balance=balance-amount;
    		System.out.println("withdrawn: "+amount);
    	}
    	else {
    		System.out.println("insufficient balance or invalid amount");
    	}
    }
    


    

    void displayAccountDetails(){
    	if(this instanceof BankAccount) {
        System.out.println("----Account Details-----");
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : "+balance);

       
    	}   
    }
        static void getTotalAccounts(){

            System.out.println("\nTotal Bank Accounts created : " + totalAccounts);


        }

}



   class BankAccountSystem{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of accounts to create : ");
            int n = sc.nextInt();
            sc.nextLine();
            
            BankAccount[] account=new BankAccount[n];

            for(int i = 0 ; i< n; i++){
//                System.out.println("\nEnter details for Account " + i);
//                System.out.println("Enter Acoount Holder Name : ");
//
//                String holderName = sc.nextLine();
//                System.out.println("Enter ACoount number  : ");
//                int accNumber = sc.nextInt();
//                sc.nextLine();
//
//                //Creating Bank Account Object 
//                BankAccount account = new BankAccount(holderName , accNumber);
//
//                //InstanceOf 
//
//                if(account instanceof  BankAccount){
//                    account.displayAcoountDetails();
//                }
            	
            	System.out.println("enter details fot account "+(i+1));
            	System.out.println("enter account holder name: ");
            	String name=sc.nextLine();
            	
            	System.out.println("enter account number: ");
            	String accno=sc.nextLine();
            	
            	System.out.println("enter initial balance: ");
            	double balance=sc.nextDouble();
            	sc.nextLine();
            	
            	account[i]=new BankAccount(name,accno,balance);
            	
            	
            	
            }
            BankAccount.getTotalAccounts();
            	
            	
            	System.out.println("enter account index");
            	int index=sc.nextInt()-1;
            	
            	System.out.println("enter deposit");
            	double dep=sc.nextDouble();
            	account[index].deposit(dep);
            	
            	System.out.println("enter withdrawl amount:");
            	double wit=sc.nextDouble();

            	account[index].withdraw(wit);
            	account[index].displayAccountDetails();
            }
//            
        
    }
    
    
