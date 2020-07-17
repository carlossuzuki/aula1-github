package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductContrutores;

public class ProgramContrutores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
	//	System.out.print("Quantity in stock: ");
	//	int quantity = sc.nextInt();

	//	ProductContrutores productContrutores = new ProductContrutores(name, price, quantity);
		ProductContrutores productContrutores = new ProductContrutores(name, price);

		System.out.println("Product data: " + productContrutores.toString());

		System.out.print("Enter the number of products to be added in stock: ");

		int adquantity = sc.nextInt();
		productContrutores.addProducts(adquantity);

		System.out.println("Updated data: " + productContrutores.toString());

		System.out.print("Enter the number of products to be removed from stock: ");

		int rmquantity = sc.nextInt();
		productContrutores.removeProducts(rmquantity);

		System.out.println("Updated data: " + productContrutores.toString());

		sc.close();
	}

}
