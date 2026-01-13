public class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException{
        if(amount>100000){
            throw new PaymentFailedException("card limit exceeded");
        }

        System.out.println("paid Rs. "+amount+" using card");
    }


    
}
