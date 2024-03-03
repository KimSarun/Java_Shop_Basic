import java.util.*;

public class Order {
	private String id;
	private Double sum;
	private String info;
	private List<Product> product_list = new ArrayList<Product>();
	
	public Order(String id, List<Product> product_list) {
		this.id = id;
	}
	
	public void add_product(Product product) {
		product_list.add(product);
	}
	
	public Double getSummary() {
		Spliterator<Product> product = product_list.spliterator();
		product.forEachRemaining((price) -> sum = sum + price.getPrice());
		return sum;
	}
	
	public String getInfo() {
		Spliterator<Product> product = product_list.spliterator();
		product.forEachRemaining((product_info) -> info = info + product_info.getName() + " - " + 
		String.valueOf(product_info.getPrice()) + "\n");
		return "Order ID: " + id + "\nProduct List: \n" + info + "Total: " + String.valueOf(sum);
	}
	
	public String getId() {
		return id;
	}
	
}
