package com.edu3;

public class ContractEmployee extends Employee implements Calculation{

	private String federalTaxIdmember;
    private int fixedMonthlyPayment;
    
	public ContractEmployee(String employeeld, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
		
		super(employeeld, name);
		
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

	@Override
	public String toString() {
		return "ContractEmployee [calculatePay()=" + calculatePay() + ", getEmployeeld()=" + getEmployeeld()
				+ ", getName()=" + getName() + "]";
	}	
}
