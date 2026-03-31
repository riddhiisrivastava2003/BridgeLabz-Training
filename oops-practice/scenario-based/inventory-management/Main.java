import java.util.*;
public class Main{
    public static void main(String[] args) {

        Inventory inventory=new Inventory();
        Scanner sc=new Scanner(System.in);


        while(true){
            try{
                System.out.println("enter your choice");
                System.out.println("1.add product");
                System.out.println("2.view product");
                System.out.println("3.update product");
                System.out.println("4.delete product");
                System.out.println("5.use product");
                System.out.println("6.exit");
                int choice=sc.nextInt();


                switch(choice){
                    case 1:
                        System.out.println("enter product id");
                        int id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter product name");
                        String name=sc.nextLine();
                        System.out.println("enter product quantity");
                        int quantity=sc.nextInt();
                        inventory.addProduct(id,name,quantity);
                        break;
                    case 2:
                        inventory.viewProduct();
                        break;
                    case 3:
                        System.out.println("enter product id");
                        int pid=sc.nextInt();

                        System.out.println("enter quantity");
                        int q=sc.nextInt();
                        inventory.updateProduct(pid,q);
                        break;
                    case 4:
                        System.out.println("enter product id");
                        int uid=sc.nextInt();
                        inventory.deleteProduct(uid);
                        break;
                    case 5:
                        System.out.println("enter product id");
                        int ppid=sc.nextInt();
                        
                        System.out.println("enter quantity");
                        int qt=sc.nextInt();
                        inventory.useProduct(ppid,qt);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }

                        
                        
   
            }catch(OutOfStockException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();

            }
        }
    }
}