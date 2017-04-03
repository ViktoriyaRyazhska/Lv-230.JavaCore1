
public class SalariedEmployee extends Employee implements Calculate{
	

	
	private int socialSecurityNumber;
	private int fixedMonthlyPayment;
	
	
	public SalariedEmployee(String employeeID, String name, int socialSecurityNumber, int fixedMonthlyPayment) {
		super(employeeID, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", fixedMonthlyPayment="
				+ fixedMonthlyPayment + "]";
	}
	
}
