package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrdEncapsulamento;


public class PgmEncapsulamento {

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
	
			
		PrdEncapsulamento prdEncapsulamento = new PrdEncapsulamento(name, price);

		//prdEncapsulamento.quantity = 2;
		prdEncapsulamento.setName("Carlos");
		prdEncapsulamento.setPrice(20.00);
		
		System.out.println("Product data: " + prdEncapsulamento.toString());

		System.out.print("Enter the number of products to be added in stock: ");

		int adquantity = sc.nextInt();
		prdEncapsulamento.addProducts(adquantity);

		System.out.println("Updated data: " + prdEncapsulamento.toString());

		System.out.print("Enter the number of products to be removed from stock: ");

		int rmquantity = sc.nextInt();
		prdEncapsulamento.removeProducts(rmquantity);

		System.out.println("Updated data: " + prdEncapsulamento.toString());

		sc.close();
	}

}
