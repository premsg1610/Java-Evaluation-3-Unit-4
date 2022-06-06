package com.Evaluation3_Q2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	@Override
	void calculateSalary() {
		
		double pfAmount = basicPay * 0.12;
		
		salary = basicPay - pfAmount;
		
	}
	


	public PermanentEmployee(String employeeId, String employeeNmae, double basicPay) {
		super(employeeId, employeeNmae);
		this.basicPay = basicPay;
	}
	
	

	

	
}
