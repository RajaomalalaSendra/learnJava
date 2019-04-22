package com.two;

import com.five.Name;
import com.five.Account;
import java.util.Scanner;

public class HelloEverybody{
	Name name;
	Account account;
	public HelloEverybody(Name name, Account account){
		this.name = name;
		this.account = account;
	}
	public static void main(String[] args) {
		// creation of the database of the person
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String theName = scanner.nextLine();
		System.out.print("LastName: ");
		String theLastName = scanner.nextLine();
		System.out.print("Email: ");
		String theEmail = scanner.nextLine();
		System.out.print("Password: ");
		String thePassword = scanner.nextLine();
		System.out.print("Password Confirmation: ");
		String thePasswordConfirmation = scanner.nextLine();
		// the name and the account
		Name myName = new Name();
		Account myAccount = new Account();
        // setter of all the two class
        myName.setName(theName);
        myName.setLastName(theLastName);
        myAccount.setEmail(theEmail);
        myAccount.setPassword(thePassword);
        myAccount.setPasswordConfirmation(thePasswordConfirmation);
        // creation of the helllo everybody
        HelloEverybody body = new HelloEverybody(myName, myAccount);
        // getter for all
        if (body.account.getPassword().equals(body.account.getPasswordConfirmation())) {
                System.out.println("========================================");
        	    System.out.println("Welcome to HelloEverybody " + body.name.getName());
        	    System.out.println("Here is the detail of your account:");
                System.out.println("========================================");
				System.out.println("Name: " + body.name.getName());
				System.out.println("LastName: " + body.name.getLastName());
				System.out.println("========================================");
				System.out.println("Email: " + body.account.getEmail());
				System.out.println("Password: " + body.account.getPassword());
				System.out.println("Password Confirmation: " + body.account.getPasswordConfirmation());
				System.out.println("========================================");	
        } else {
        	System.out.println("That all for today.:-).");
        }
	}
}