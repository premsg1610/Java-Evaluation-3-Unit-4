package com.Evaluation3_Q2;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;
	
	
	@Override
	void calculateSalary() {
		
		salary = hoursWorked * hourlyWages;
		
	}


	public TemporaryEmployee(String employeeId, String employeeNmae, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeNmae);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	
	
}
