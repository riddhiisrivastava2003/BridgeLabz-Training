import java.util.*;

public class ShoppingCart {
	private Map<String , Double> priceMap = new HashMap<>();
	private Map<String, Double> cart = new LinkedHashMap<>();
	public void addProduct(Product product) {
		priceMap.put(product.getName(), product.getPrice());
		cart.put(product.getName(), product.getPrice());
		
	}


    public void displayCart() {

        System.out.println("\nitems in cart (insertion order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " :Rs " + entry.getValue());
        }
    }

    public void displaySortedByPrice() {
    	TreeMap<Double, List<String>> sortedMap = new TreeMap<>();
    	for(Map.Entry<String , Double > entry : cart.entrySet()) {
    		sortedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
            .add(entry.getKey());
    	}

		
    	System.out.println("\nitems sorted by price: ");
    	for(Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
    		for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
    	}
    }

}