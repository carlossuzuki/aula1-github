package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there any deposit (y/n)? : ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value : ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
		} else {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount.toString());

		System.out.println();
		System.out.print("Enter a deposit value : ");
		double depValue = sc.nextDouble();
		bankAccount.deposit(depValue);
		System.out.println("Updated account data:");
		System.out.println(bankAccount.toString());
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double witValue = sc.nextDouble();
		bankAccount.withdraw(witValue);
		System.out.println("Updated account data:");
		System.out.println(bankAccount.toString());

		sc.close();
	}
}
