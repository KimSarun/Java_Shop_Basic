public class Product {
	private String name;
	private String product_id;
	private Double price;
	
	public Product(String name, String product_id, Double price) {
		this.name = name;
		this.product_id = product_id;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return product_id;
	}
	public Double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String product_id) {
		this.product_id = product_id;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
