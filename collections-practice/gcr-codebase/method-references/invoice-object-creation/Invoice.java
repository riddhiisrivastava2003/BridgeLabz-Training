public class Invoice{

    int transactionId;

    Invoice(int transactionId){
        this.transactionId = transactionId;
    
    }

    void display(){
        System.out.println("Invoice created for transaction id: "+transactionId);
    }
}