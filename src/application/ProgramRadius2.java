package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRadius2 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");

		double radius = sc.nextDouble();

		double c = circunference(radius);
		double v = volume(radius);

		// double circunference = 2 * PI * radius;
		// double volume = 4 * PI * Math.pow(radius, 3) / 3;

		System.out.printf("Circunference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value: %.4f", PI);

		sc.close();
	}

	public static double circunference(double radius) {
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3.0;
	}
}