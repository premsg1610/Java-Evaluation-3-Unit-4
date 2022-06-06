package com.Evaluation3_Q2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee)
		{
			double loan = PermanentEmployee.salary * (15/100);
		}
		
	}
	

	private Loan() {
		
	}
	
	
}
