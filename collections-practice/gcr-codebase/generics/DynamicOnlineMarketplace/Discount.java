public class Discount{

    public static <T extends Product<?>> void applyDiscount(T product, double discountPercentage){
        // double currentPrice = product.getPrice();
        // double newPrice = currentPrice * (1 - discountPercentage / 100);
        // product.setPrice(newPrice);

        double newPrice = product.getPrice() - (product.getPrice() * discountPercentage / 100);
        product.setPrice(newPrice);
        System.out.println("discount percentage "+discountPercentage);
    }

    }
