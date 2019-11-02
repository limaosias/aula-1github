package apllicatiom;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.nextLine().charAt(0);
		if (response == 'y') {
			System.out.print("Enter a initital deposit value: ");
			double initialDesposit = sc.nextDouble();		     
		    account = new Account(holder, number, initialDesposit);
		}else {
			account = new Account(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("updated account data:" );
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a whithdraw: ");
		double whithdrawValue = sc.nextDouble();
		account.whithdraw(whithdrawValue);
		System.out.println("updated account data:" );
		System.out.println(account);
		System.out.println();
		
		
			
		
		
		
		
		sc.close();
		
	}
}
