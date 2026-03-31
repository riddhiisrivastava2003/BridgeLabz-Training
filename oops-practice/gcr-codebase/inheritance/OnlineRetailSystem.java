import java.util.*;

class Order{
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;

    }
    String getOrderStatus(){
        return "order placed";
    } 
}
class ShippedOrder extends Order{
    String trackNumber;

    ShippedOrder(String orderId ,String orderDate, String trackNumber){


        super(orderId, orderDate);

        this.trackNumber = trackNumber;

    }

    String getOrderStatus(){
        return "order shipped";

    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackNumber, String deliveryDate){
        super(orderId, orderDate, trackNumber);
        this.deliveryDate = deliveryDate;

    }

    String getOrderStatus(){
        return "order delivered";

    }
}

public class OnlineRetailSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter order id: ");
        String orderId = sc.nextLine();

        System.out.println("enter order date: ");
        String orderDate = sc.nextLine();

        System.out.println("enter tracking number : ");
        String trackingNumber = sc.nextLine();

        System.out.println("enter delivery date : ");
        String deliveryDate = sc.nextLine();

        DeliveredOrder order = new DeliveredOrder(orderId , orderDate, trackingNumber, deliveryDate);
        System.out.println("order details");
        System.out.println("order id: " + order.orderId);
        System.out.println("order date: " + order.orderDate);
        System.out.println("tracking number : " + order.trackNumber);
        System.out.println("delivery date : " + order.deliveryDate);
        System.out.println("order status : " + order.getOrderStatus());

    }

    

    
}