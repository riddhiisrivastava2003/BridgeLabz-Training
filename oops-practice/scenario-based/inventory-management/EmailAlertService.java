public class EmailAlertService implements AlertService{
    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("Email Alert: Product " + product.getName() + " is running low on stock!");
    }

    
}