package application;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter a number account: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} else {
			account = new Account(number, name);
		}
		
		System.out.print("");
		System.out.print("Account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.print("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.print("Updated account data: ");
		System.out.println(account.toString());
		
		sc.close();
		
	}

}
