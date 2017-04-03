package yaremchuk.olga.inheritance.calc.salary;

public class SalariedEmployee extends Employee implements PaymentCalc{
	String socialSecurityNumber;
	int salary;
	final int FIX_PAYMENT = 1000; //1000$
	
	public SalariedEmployee() {}

	public SalariedEmployee(String employeeld, int iD, String name, String socialSecurityNumber) {
		super(employeeld, iD, name);
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getFIX_PAYMENT() {
		return FIX_PAYMENT;
	}

	@Override
	public void calculatePay() {
		salary = FIX_PAYMENT;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", salary=" + salary
				+ ", FIX_PAYMENT=" + FIX_PAYMENT + ", employeeld=" + employeeld + ", ID=" + ID + ", name=" + name + "]";
	}
	
	

}
