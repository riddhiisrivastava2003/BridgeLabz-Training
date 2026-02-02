import java.util.*;

public class EcommerceSorting{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Product> products=new ArrayList<>();

        products.add(new Product(1, "Laptop", 80000, 4.5, 10));
        products.add(new Product(2, "Mobile", 25000, 4.2, 15));
        products.add(new Product(3, "Tablet", 30000, 4.0, 20));
        products.add(new Product(4, "TV", 50000, 4.8, 5));
        products.add(new Product(5, "Digital Watch", 15000, 4.8, 5));

        while(true){
        System.out.println("Sorting the products by: ");
        System.out.println("1. Price");
        System.out.println("2. Rating");
        System.out.println("3. Discount");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice=sc.nextInt();


        Comparator<Product> comparator=null;
        

        switch(choice){
            case 1:
                comparator=(p1,p2)->Double.compare(p1.price,p2.price);
                break;
            case 2:
                comparator=(p1,p2)->Double.compare(p2.rating,p1.rating);
                break;
            case 3:
                comparator=(p1,p2)->Double.compare(p1.discount,p2.discount);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                continue;
        }
        

        Collections.sort(products,comparator);

        System.out.println("Sorted products: ");
        for(Product p:products){    

            System.out.println(
                "Product id: "+p.id+" | Product name: "+p.name+" | Product price: "+p.price+" | Product discount: "+p.discount+" | Product rating: "+p.rating
            );
        }
        }
            
    }
}