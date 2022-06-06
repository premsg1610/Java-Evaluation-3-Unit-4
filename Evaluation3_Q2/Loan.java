package com.Evaluation3_Q2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee)
		{
			double loan = employeeObj.getSalary() * (15/100);
			return loan;
		}
		else if(employeeObj instanceof TemporaryEmployee)
		{
			double loan = employeeObj.getSalary() * (10/100);
			return loan;
		}
		return 0.00;
		
	}
	

	private Loan() {
		
	}
	
	public static Loan getloanObj() {
		
		Loan loan = new Loan();
		
		return loan;
	}
	
	
}
