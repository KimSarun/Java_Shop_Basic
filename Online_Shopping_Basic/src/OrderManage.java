import java.util.*;

public class OrderManage {
	Dictionary<String, Order> orders = new Hashtable<>();
	
	public void add_order(Order order) {
		orders.put(order.getId(), order);
	}
	
	public void addProduct(String id, Product product) {
		orders.get(id).add_product(product);
	}
	public Double getSum(String id) {
		return orders.get(id).getSummary();
	}
	public String getDetail(String id) {
		return orders.get(id).getInfo();
	}
	public void removeOrder(String id) {
		orders.remove(id);
	}
	
}
