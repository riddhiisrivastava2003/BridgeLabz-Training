import java.util.*;
public class UserInterface{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Utility utility=new Utility();

        System.out.print("enter the goods transport details: ");
        String input=sc.nextLine();

        String transportId=input.split(":")[0];

        if(!utility.validateTransportId(transportId)){
            System.err.println("please provide a valid record");
            return;
        }

        GoodsTransport goodsTransport=utility.parseDetails(input);

        String objectType=utility.findObjectType(goodsTransport);

        System.out.println("transporter id: "+goodsTransport.getTransportId());
        System.out.println("transportation date: "+goodsTransport.getTransportDate());
        System.out.println("transporter rating: "+goodsTransport.getTransportRating());

        if(goodsTransport instanceof BrickTransport){
            BrickTransport brickTransport=(BrickTransport)goodsTransport;

            System.out.println("brick quantity: "+brickTransport.getBrickQuantity());
            System.out.println("brick price: "+brickTransport.getBrickPrice());

        }
        else {
            TimberTransport timberTransport=(TimberTransport)goodsTransport;
           // System.out.println("timber length: "+timberTransport.getTimberLength());
           // System.out.println("timber radius: "+timberTransport.getTimberRadius());
            System.out.println("timber type: "+timberTransport.getTimberType());
            System.out.println("timber price: "+timberTransport.getTimberPrice());
        }

        System.out.println("vehicle selected: "+goodsTransport.vehicleSelection());
        System.out.println("total charge: "+goodsTransport.calculateTotalCharge());
        sc.close();
    
        



    }
}


