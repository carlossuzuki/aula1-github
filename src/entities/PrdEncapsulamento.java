package entities;

public class PrdEncapsulamento {

	private String name;
	private double price;
	private int quantity;

	public PrdEncapsulamento() {
	}

	public PrdEncapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public PrdEncapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
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
