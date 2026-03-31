import java.util.*;
public class BankAccount {
	
	String name;
	String accNumber;
	double balance;
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("deposited "+amount);
		display();
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("withdrawn "+amount);
			display();
		}
		
		else {System.out.println("insufficient balance");}
		
		
	}
	
	public void display() {
		System.out.println("current balance "+balance);
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		BankAccount account=new BankAccount();
		
		System.out.println("enter holder name ");
		account.name=sc.nextLine();
		
		System.out.println("enter holder number ");
		account.accNumber=sc.nextLine();
		
		System.out.println("enter balance ");
		account.balance=sc.nextInt();
		
		System.out.println("\n Punjab national Bank\n");
		account.display();
		
		System.out.println("enter amount to be depositted");
		double depositAmt=sc.nextDouble();
		account.deposit(depositAmt);
		
		System.out.println("enter amount to be withdrawn");
		double withdrawAmt=sc.nextDouble();
		account.withdraw(withdrawAmt);
		
		
		
		
	}

}
