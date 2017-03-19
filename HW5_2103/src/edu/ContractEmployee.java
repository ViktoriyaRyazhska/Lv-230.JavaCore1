package edu;

public class ContractEmployee extends Employee implements Calculate{

	private double fixedMonthlyPayment;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ContractEmployee(double fixedMonthlyPayment) {
		super();
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}



	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}



	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}



	@Override
	public void calculatePay() {
		System.out.println("employees with a fixed payment : the average monthly salary = "+fixedMonthlyPayment);
		
	}



	@Override
	public String toString() {
		return "ContractEmployee [fixedMonthlyPayment=" + fixedMonthlyPayment + ", getEmployeeld()=" + getEmployeeld()
				+ ", getName()=" + getName() + "]";
	}
	
	
	
	

}
