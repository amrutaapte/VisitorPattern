package product;

public abstract class Product {
	
	private String name;
	private int qty;
	private float unitPrice;
	
	public Product(String name, float price) {
		// Product Constructor
		this.name = name;
		this.unitPrice = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
