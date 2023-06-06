package com.GreatLearning.interfaces;

import com.GreatLearning.model.Employee;

public interface ITcredentails {
	

	public String generateEmailAdderess(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void showCredentials(Employee emp);
}
