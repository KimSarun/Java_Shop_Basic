import java.util.*;

public class Stock {
	Dictionary<String, Product> products = new Hashtable<>();
	
	public void addProduct(String name, String product_id, Double price) {
		products.put(product_id, new Product(name, product_id, price));
	}
	public void removeProduct(String product_id) {
		products.remove(product_id);
	}
	public void updateProduct(String product_id, String name, Double price) {
		Product product = products.get(product_id);
		product.setName(name);
		product.setPrice(price);
	}
	public String productDetail(String product_id) {
		Product product = products.get(product_id);
		return "Product name: " + product.getName() + "\nPrice: " + product.getPrice();
	}
	
}
