
import java.util.*;

interface Taxable{

    double calculateTax();


    String getTaxDetails();


}



abstract class Product{
    private int productId;

    private String productName;
    private double price;

    public Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public abstract double calculateDiscount();



    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;

    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}

class Electronics extends Product implements Taxable{
    public Electronics(int productId ,String productName, double price){
        super(productId, productName , price);
    }

    public double calculateDiscount(){

        return getPrice()* 0.10;

    }
    public double calculateTax() {

        return getPrice()* 0.18; 

    }
    public String getTaxDetails(){

        return "18% gst applied";
    }
}

class Clothing extends Product implements Taxable{
    public Clothing(int productId, String productName, double price){
        super(productId , productName, price);
    }

    public double calculateDiscount(){

        return getPrice()* 0.20;

    }

    public double calculateTax(){

        return getPrice()*0.12;

    }
    public String getTaxDetails(){
        return "12% gst applied";

    }
}


class Groceries extends Product{
    public Groceries(int productId, String productName, double price){

        super(productId, productName , price);
    }
    public double calculateDiscount(){
        return getPrice()*0.05;
    }

      public String getTaxDetails(){
        return "5% gst applied";
}
}

public class ECommerce{

    public static void printFinalPrice(List<Product> productList) {

        for(Product product : productList){

            double tax = 0;
            if(product instanceof Taxable){

                tax = ((Taxable)product).calculateTax();

            }
            double discount = product.calculateDiscount();
            
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("\nproduct id: "+product.getProductId());

            System.out.println("product name: "+product.getProductName());

            System.out.println("base price : "+product.getPrice());

            System.out.println("discount : "+discount);

            System.out.println("tax: "+tax);
            System.out.println("final price: "+finalPrice);

            if(product instanceof Taxable){

                System.out.println("tax info: " +((Taxable) product).getTaxDetails());
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        System.out.println("enter no. of products: ");
        int totalProducts =  sc.nextInt();
        for(int i = 1; i <= totalProducts; i++){
            System.out.println("\nproduct " + i);
            System.out.println("1. electronics");
            System.out.println("2. clothing");
            System.out.println("3. groceries");

            System.out.println("choose product type: ");
            int choice = sc.nextInt();


            System.out.println("enter product id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("enter product name: ");
            String name = sc.nextLine();
            System.out.println("enter product price: ");
            double price  = sc.nextDouble();

            if(choice == 1 ){
                products.add(new Electronics(id,name,price));

            }else if(choice == 2 ){


                products.add(new Clothing(id,name,price));
            }else if(choice == 3){

                products.add(new Groceries(id,name,price));

            }else{
                System.out.println("Invalid CHoice !");
            }


            


        }
        System.out.println("----Final Price Details----");
        printFinalPrice(products);


    }

}