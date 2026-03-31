import java.util.*;

interface Discountable{
    void applyDiscount(double percentage);

    String getDiscountDetails();

}


abstract class FoodItem implements Discountable{

    private String itemName;
    private double price;

    private int quantity;
     private double discountAmount=0;

     public FoodItem(String itemName,double price, int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
     }


     public abstract double calculateTotalBill();

     public void getItemDetails(){
        System.out.println("item name: "+itemName);
        System.out.println("price: "+price);
        System.out.println("quantity: "+quantity);
        System.out.println("discount: "+discountAmount);
     }

     protected double getBasePrice(){
        return price*quantity;
     }

     protected void setDiscountAmount(double discountAmount){
        this.discountAmount=discountAmount;
     }

     protected double getDiscountAmount(){
        return discountAmount;
     }

     @Override

     public void applyDiscount(double percentage){
        double total=calculateTotalBill();

        discountAmount=total*(percentage/100);
     }

     @Override
     public String getDiscountDetails(){
        return "discount applied: "+discountAmount;
     }
}



class VegItem extends FoodItem{
     private static final double EXTRA_CHARGE=50;
    public VegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }

    @Override

    public double calculateTotalBill(){
        return (getBasePrice()+EXTRA_CHARGE)-getDiscountAmount();
    }
}


class NonVegItem extends FoodItem{

   
    public NonVegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }

    @Override

    public double calculateTotalBill(){
        return (getBasePrice())-getDiscountAmount();
    }
}

public class OnlinefoodDeliveringSystem{
    public static void processOrder(FoodItem item){
        item.getItemDetails();
        System.out.println(item.getDiscountDetails());
        System.out.println("total payable: "+item.calculateTotalBill());

        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        List<FoodItem> orderList=new ArrayList<>();

        System.out.println("enter number of food item:");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
        System.out.println("enter details for item: "+(i+1));

            System.out.println("item name: ");
            String name=sc.nextLine();
           // sc.nextLine();

            System.out.println("price: ");
            double price=sc.nextDouble();

            System.out.println("quantity: ");
            int quantity=sc.nextInt();
            sc.nextLine();

                System.out.println("enter type(1-veg/2-non-veg)");
                int type=sc.nextInt();

                sc.nextLine();

               FoodItem item;

                if(type==1){
                  item=new VegItem(name,price,quantity);

                    
                }
                else{
                    item=new NonVegItem(name,price,quantity);
                }
               

              System.out.println("apply discount: ");
              double discount=sc.nextDouble();
              sc.nextLine();

              item.applyDiscount(discount);
              orderList.add(item);
            }


              System.out.println("----order summary----");
              for(FoodItem item:orderList){
                processOrder(item);
              }


        }
    }
