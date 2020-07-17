package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada: ");

		Student stu = new Student();

		stu.name = sc.nextLine();
		stu.g1 = sc.nextDouble();
		stu.g2 = sc.nextDouble();
		stu.g3 = sc.nextDouble();

		System.out.println("Saida: ");
		System.out.println("FINAL GRADE = " + stu.finalGrade());

		if (stu.missingPoints() != 0.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", stu.missingPoints());
		} else {
			System.out.println("PASS");

		}
		sc.close();
	}

}
