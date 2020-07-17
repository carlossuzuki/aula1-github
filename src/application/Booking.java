package application;

import java.util.Scanner;

import entities.Guest;

public class Booking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Guest[] guest = new Guest[10];

		System.out.print("How many rooms will be rented: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent# " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String eMail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			guest[room] = new Guest(name, eMail);
		

		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (guest[i] != null) {
				System.out.println(i + guest[i].toString());
			}

		}

		sc.close();
	}

}
