package com.Evaluation3_Q2;

public class Main {

	
	public static void main(String[] args) {
		
		Loan l = Loan.getloanObj();
		
		l.calculateLoanAmount(new PermanentEmployee("1234", "prem", 0));
		l.calculateLoanAmount(new TemporaryEmployee("4567", "priyanka", 0, 0));
		l.calculateLoanAmount(null);
		
	}
}
