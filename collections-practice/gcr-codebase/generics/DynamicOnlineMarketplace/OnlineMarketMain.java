import java.util.*;

public class OnlineMarketMain{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Catalogue catalogue=new Catalogue();

        while(true){
            System.out.println("1. add book");
            System.out.println("2. add gadget");
            System.out.println("3. add clothing");
            System.out.println("4. display all");
            System.out.println("5. exit");

            int choice=sc.nextInt();
            sc.nextLine();

            if(choice>=1 && choice<=3){

                System.out.println("enter product name");
                String name=sc.nextLine();

                System.out.println("enter product price");
                double price=sc.nextDouble();
                sc.nextLine();

                Product <?> product=null;

                if(choice==1){
                    product=new Product<>(name,price,new BookCategory());
                
                }

                else if(choice==2){
                    product=new Product<>(name,price,new GadgetCategory());
                }
                else{
                    product=new Product<>(name,price,new ClothingCategory());
                }

                Discount.applyDiscount(product,10);

                catalogue.addProduct(product);




            }


            else if(choice==4){
                catalogue.displayAll();
            }
            else if(choice==5){
                System.out.println("exiting");
                break;
            }
            else{
                System.out.println("invalid choice");
                break;
            }
        
        }
    }
}