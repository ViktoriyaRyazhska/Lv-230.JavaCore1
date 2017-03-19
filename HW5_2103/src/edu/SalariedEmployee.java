package edu;

public class SalariedEmployee extends Employee implements Calculate {

	private int hour;
	private double rate;
	private String socialSecurityNumber;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public SalariedEmployee(int hour, double rate, String socialSecurityNumber) {
		super();
		this.hour = hour;
		this.rate = rate;
		this.socialSecurityNumber = socialSecurityNumber;
	}








	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public double getRate() {
		return rate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}



	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	@Override
	public void calculatePay() {
	
		System.out.println("time-worker : the average monthly salary =  "+ hour*rate);
		
	}



	@Override
	public String toString() {
		return "SalariedEmployee [hour=" + hour + ", rate=" + rate + ", socialSecurityNumber=" + socialSecurityNumber
				+ ", getEmployeeld()=" + getEmployeeld() + ", getName()=" + getName() + "]";
	}


	

}
