import java.util.*;

public class CustomerManage {
	Dictionary<String, Customer> customers = new Hashtable<>();
	
	public void register(String name, String lastname, String id) {
		customers.put(id, new Customer(name, lastname, id));
	}
	
	public void customer_remove(String id) {
		customers.remove(id);
	}
	
	public void customer_update(String id, String name, String lastname) {
		Customer customer = customers.get(id);
		customer.setName(name);
		customer.setLastname(lastname);
	}
	
	public String customer_detail(String id) {
		Customer customer = customers.get(id);
		return "Name: " + customer.getName() + "\nLastname: " + customer.getLastname();
	}
}
