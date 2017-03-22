package com.edu3;

public class SalariedEmployee extends Employee implements Calculation  {

	private String socialSecurityNumber; 
	private int hourlyRate; 
	private int numberOfHoursWorked;
	
	public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int hourlyRate, 
	int numberOfHoursWorked) {
		
		super(employeeld, name);
		
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public double calculatePay() {
		return hourlyRate*numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [calculatePay()=" + calculatePay() + ", getEmployeeld()=" + getEmployeeld()
				+ ", getName()=" + getName() + "]";
	} 
}
