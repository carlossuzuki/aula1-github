package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Triangle x, y;

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangule X : ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		double areaX = x.area();

//		double p = (x.a + x.b + x.c) / 2;
//		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		System.out.println("Enter the measures of triangule Y : ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		// p = (y.a + y.b + y.c) / 2;
		// double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangule X area : %.4f%n", areaX);
		System.out.printf("Triangule Y area : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area : X");
		} else {
			System.out.println("TLarger area : Y");
		}
		
		System.out.println("Bom dia ");
		System.out.println("Bom tarde ");
		sc.close();
	}

}
