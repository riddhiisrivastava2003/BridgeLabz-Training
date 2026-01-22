import java.util.*;

public class BankManager{

    private Map<Integer,Account> accounts=new HashMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue=new LinkedList<>();

    public void createAccount(int accountNumber, double balance){
        accounts.put(accountNumber,new Account(accountNumber,balance));
    }

    public void requestWithdrawal(int accountNumber, double amount){
        withdrawalQueue.add(new WithdrawalRequest(accountNumber,amount));
    }

    public void processWithdrawalRequests(){
        while(!withdrawalQueue.isEmpty()){
            WithdrawalRequest request=withdrawalQueue.poll();
            Account account=accounts.get(request.getAccountNumber());
            if(account.withdraw(request.getAmount())){
                System.out.println("withdrawal of " + request.getAmount() + "successful for account " + request.getAccountNumber());
            }
            else{
                System.out.println("withdrawal of " + request.getAmount() + "failed for account " + request.getAccountNumber());
            }
        }
    }


    public void displayAccounts(){
        System.out.println("accounts:");
        for(Account account:accounts.values()){
            System.out.println(account);
        }
    
    }


    public void displaySortedByBalance(){
        TreeMap<Double,List<Account>> sortedAccounts=new TreeMap<>();
        for(Account account:accounts.values()){
            sortedAccounts.putIfAbsent(account.getBalance(),new ArrayList<>());
            sortedAccounts.get(account.getBalance()).add(account);
        }

        System.out.println("accounts sorted by balance:");
        for(Map.Entry<Double,List<Account>> entry:sortedAccounts.entrySet()){
            System.out.println("balance: " + entry.getKey());
            for(Account account:entry.getValue()){
                System.out.println(account);
            }
        }
    }

    }



    
