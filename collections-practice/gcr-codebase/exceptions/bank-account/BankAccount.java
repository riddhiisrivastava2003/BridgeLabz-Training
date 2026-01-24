public class BankAccount{

    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void withdrawl(double amount) throws InsufficientBalanceException{

        if(amount <0){
            throw new IllegalArgumentException("invalid amount!");
        }

        if(amount>balance){
            throw new InsufficientBalanceException("insufficient balance!");
        }
        balance=balance-amount;
        System.out.println("withdrawl successful");
        System.out.println("new balance: "+balance);
    }
}