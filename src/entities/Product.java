package entities;

//Programa controle de estoque
public class Product {
	String name;
	private double price;
	private int quantity;
		
	public Product() {
		
	}
	

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}

	// Calcula valor existente no estoque
	public double totalValueinStock() {
		return quantity * price;
	}

	// Acrescenta produtos no estoque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// Remove produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+", $ "
				+String.format("%.2f", price)
				+ " , " + quantity + "units, total: $ "
				+ String.format("%.2f", totalValueinStock());

	}

}
