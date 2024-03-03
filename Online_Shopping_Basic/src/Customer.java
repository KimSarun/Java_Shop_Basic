
public class Customer {
	private String name;
	private String lastName;
	private String customer_id;
	
	public Customer(String name, String lastName, String customer_id) {
		this.name = name;
		this.lastName = lastName;
		this.customer_id = customer_id;
	}
	
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastName;
	}
	public String getId() {
		return customer_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public void setId(String customer_id) {
		this.customer_id = customer_id;
	}
}
