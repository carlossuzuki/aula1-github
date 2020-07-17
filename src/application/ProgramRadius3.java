package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramRadius3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		
		Calculator calc = new Calculator();

		double radius = sc.nextDouble();

		double c = calc.circunference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circunference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value: %.4f", calc.PI);

		sc.close();
	}
}
