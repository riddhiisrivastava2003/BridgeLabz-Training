

import java.util.*;

class BankAccount{
	
	String accountNumber;
	double balance;
	
	BankAccount(String accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	
	void display() {
	System.out.println("account number "+accountNumber);
	System.out.println("balance "+balance);
	
	}
	
	
}

class SavingsAccount extends BankAccount{
	double interest;
	SavingsAccount(String accountNumber,double balance,double interest){
		super(accountNumber,balance);
		this.interest=interest;
	}
	void displayType() {
		System.out.println("account type: savings");
		System.out.println("interest rate %: "+interest);
	}
}

class CheckingAccount extends BankAccount{
	double withdrawl;
	CheckingAccount(String accountNumber,double balance,double withdrawl){
		super(accountNumber,balance);
		this.withdrawl=withdrawl;
	}
	void displayType() {
		System.out.println("account type: checking");
		System.out.println("withdrawl limit: "+withdrawl);
	}
}


class FixedAccount extends BankAccount{
	int tenure;
	FixedAccount(String accountNumber,double balance,int tenure){
		super(accountNumber,balance);
		this.tenure=tenure;
	}
	void displayType() {
		System.out.println("account type: fixed");
		System.out.println("tenure: "+tenure);
	}
}





public class BankAccountSystem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter account type(savings/checking/fixed):");
		String type=sc.nextLine();
		
		System.out.println("enter account number");
		String accno=sc.nextLine();
		
		System.out.println("enter balance");
		double balance=sc.nextDouble();
		
		
		sc.nextLine();
		
		BankAccount bank=null;
		
		switch (type) {
		case "savings":
			System.out.println("enter interest rate");
			double rate=sc.nextDouble();
			bank=new SavingsAccount(accno,balance,rate);
			break;
		case "checking":
			System.out.println("enter withdrawl limit");
			double limit=sc.nextDouble();
			bank=new CheckingAccount(accno,balance,limit);
			break;
		case "fixed":
			System.out.println("enter tenure");
			int months=sc.nextInt();
			bank=new FixedAccount(accno,balance,months);
			break;
			
			default:
				System.out.println("invaild input");
				return;
			
			
		}
		
		System.out.println("account details");
		bank.display();
		
		if(bank instanceof SavingsAccount) {
			((SavingsAccount) bank).displayType();
			
		}
		else if(bank instanceof CheckingAccount) {
			((CheckingAccount) bank).displayType();
			
		}
		
		else if  (bank instanceof FixedAccount) {
			((FixedAccount) bank).displayType();
			
		}
		
	}

}
