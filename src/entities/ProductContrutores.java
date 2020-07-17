package entities;

public class ProductContrutores {

	public String name;
	public double price;
	public int quantity;

	public ProductContrutores() {
	}

	public ProductContrutores(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public ProductContrutores(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int qtd) {
		this.quantity += qtd;
	}

	public void removeProducts(int qtd) {
		this.quantity -= qtd;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
