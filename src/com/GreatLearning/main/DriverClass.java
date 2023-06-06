package com.GreatLearning.main;

import java.util.Scanner;
import com.GreatLearning.model.Employee;
import com.GreatLearning.service.CredentialService;
import com.GreatLearning.interfaces.ITcredentails;

public class DriverClass {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter First Name ");
		String firstName = sc.next();
		
		System.out.println("Please enter Last Name ");
		String lastName = sc.next();

		Employee emp=new Employee(firstName, lastName);
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		int option = sc.nextInt();
		String generatedEmail = null;
		String generatedPassword = null;
		
		ITcredentails ic=new CredentialService();
		switch (option) {
		
			case 1: 
				generatedEmail=ic.generateEmailAdderess(firstName,lastName,"tech");
				generatedPassword=ic.generatePassword();
				
				break;
				
			case 2: 
				generatedEmail=ic.generateEmailAdderess(firstName,lastName,"adm");
				generatedPassword=ic.generatePassword();
				
				break;
				
			case 3: 
				generatedEmail=ic.generateEmailAdderess(firstName,lastName,"hrm");
				generatedPassword=ic.generatePassword();
				
				break;
				
			case 4: 
				generatedEmail=ic.generateEmailAdderess(firstName,lastName,"legal");
				generatedPassword=ic.generatePassword();
				
				break;
			default: {
				System.out.println("Enter a valid option");
			}
		}
		
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		
		ic.showCredentials(emp);
		
		sc.close();
		

	}

}
