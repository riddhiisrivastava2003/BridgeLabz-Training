

import java.util.*;

 class BankAccount {
	
	private String accountNumber;
	private double balance;
	
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;

		//hello
		
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			balance=balance+amount;
			System.out.println("deposit successful");
			
		}
		else {
			System.out.println("invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("invalid withdrawl amount");
			
		}
		else if(amount>balance) {
			System.out.println("insufficient balance");
		}else {
			balance=balance-amount;
			System.out.println("withdrawl successful");
		}
	}
	
	public void checkBalance() {
		System.out.println("current balance: "+balance);
	}

}

public class BankKaCode{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter account number");
		String accno=sc.nextLine();
		
		System.out.println("enter initial balance");
		double initial=sc.nextDouble();
		
		BankAccount account=new BankAccount(accno,initial);
		
		int choice;
		
		do {
			System.out.println();
			System.out.println("bank menu");
			System.out.println("1. deposit");
			System.out.println("2. withdraw");
			System.out.println("3. check balance");
			System.out.println("4. exit");
			System.out.println("enter choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter deposit amount: ");
				account.deposit(sc.nextDouble());
				break;
			case 2:
				System.out.println("enter withdrawl amount: ");
				account.withdraw(sc.nextDouble());
				break;
			case 3:
				account.checkBalance();
				break;
			case 4:
				System.out.println("thanks for using the bank app");
				break;
				default:
					System.out.println("invalid choice");
			}
			
			
		}while(choice !=4);
		
	}
	
}
