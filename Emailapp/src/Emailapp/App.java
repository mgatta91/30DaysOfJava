package Emailapp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("First Name: ");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		
		System.out.println("Last Name: ");
		String lastName = scanner.nextLine();

		Email em1 = new Email(firstName, lastName);
		System.out.println(em1.showInfo());
		
		System.out.println("Home Address: ");
		String address = scanner.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber = scanner.nextLine();
		
		System.out.println("Social Security Number: ");
		String ssn = scanner.nextLine();
		
		System.out.println("Emergency Contact Name: ");
		String emergencyContact = scanner.nextLine();
		
		System.out.println("Emergency Contact Phone Number: ");
		String emergencyContactNumber = scanner.nextLine();
		
		CompanyAccount ca1 = new CompanyAccount(address, phoneNumber, ssn, emergencyContact, emergencyContactNumber);
		System.out.println(ca1.showInfo());
	
	}
}
