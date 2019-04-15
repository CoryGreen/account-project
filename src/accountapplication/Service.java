package accountapplication;

import java.util.Scanner;

public class Service {
	
	private void Add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = sc.nextLine();
		System.out.println("And your last name");
		String lastName = sc.nextLine();
		int accountNumber = (int)(Math.random()*1000000);
		Account account = new Account(firstName, lastName, accountNumber);
		System.out.println("Your new account has been created");
		sc.close();
	}
	
	private void Retrieve() {
		
	}

}
