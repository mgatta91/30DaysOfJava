package Emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 11;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	private String homeAddress;
	
	//Constructor to receive firstName + lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	
				
		//Call a method asking for the department - return department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		
	
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice;
		do {
			depChoice = in.nextInt();
			if (depChoice == 1) {return "Sales"; }
			else if (depChoice == 2) {return "Development"; }
			else if (depChoice == 3) {return "Accounting"; }
			else if (depChoice == 0) {return ""; }
			else { System.out.println("Incorrect Entry");}
		} while (depChoice >3 || depChoice <0);
			
			return " ";
			
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char [length];
		for (int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);	
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassowrd(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
 	}
}
