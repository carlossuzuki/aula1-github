package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRadius1 {

	public static final double PI = 3.14159;
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double circunference = 2 * PI * radius;
		double volume = 4 * PI * Math.pow(radius, 3)/3;
		
		System.out.printf("Circunference : %.2f%n", circunference);
		System.out.printf("Volume : %.2f%n", volume);
		System.out.printf("PI value: %.4f", PI);
		
		
		sc.close();		
	}
}
