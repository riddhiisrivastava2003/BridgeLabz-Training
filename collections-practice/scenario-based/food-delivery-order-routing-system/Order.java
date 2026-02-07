public class Order{

    int orderId;
    String location;

    public Order(int orderId, String location){
        this.orderId=orderId;
        this.location=location;
    }

    @Override

    public String toString(){
        return "Order Id -> "+orderId+" | Location -> "+location;
    }
}