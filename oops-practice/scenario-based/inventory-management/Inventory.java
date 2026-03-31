import java.util.*;

public class Inventory{
    private ArrayList<Product> products=new ArrayList<>();
    private AlertService alertService=new EmailAlertService();

    

    public void addProduct(int id, String name, int quantity){
        Product product=new Product(id,name,quantity);
        System.out.println("product added successfully");
        products.add(product);
        if(quantity<5){
            alertService.sendLowStockAlert(product);
        }
    }


    public void viewProduct(){
        if(products.isEmpty()){
            System.out.println("no products available");
            return;
        }

        System.out.println("id  name  quantity");
        for(Product p:products){
            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getQuantity());
        }
    

    } 


    public void updateProduct(int id, int quantity){
        for(Product p:products){
            if(p.getId()==id){
                p.updateQuantity(quantity);
                System.out.println("product updated successfully");
                return;

                //  if(quantity<5){
                //      alertService.sendLowStockAlert(p);
                //   return;
                // }
                
            }
        }
        System.out.println("product not found");
    }


    public void deleteProduct(int id){
        for(Product p:products){
            if(p.getId()==id){


                products.remove(p);

                System.out.println("product deleted successfully");
                return;
            }


        }
        System.out.println("product not found");
    }


    public void useProduct(int id, int quantity) throws OutOfStockException{
        for(Product p:products){
            if(p.getId()==id){
                if(p.getQuantity()<quantity){
                    throw new OutOfStockException("product out of stock");
                }   
                p.updateQuantity(p.getQuantity()-quantity);
                System.out.println("product used successfully");
                if(p.getQuantity()<5){
                    alertService.sendLowStockAlert(p);
                }
                return;
            }
        }
        System.out.println("product not found"  )
                return;
            }

        







}