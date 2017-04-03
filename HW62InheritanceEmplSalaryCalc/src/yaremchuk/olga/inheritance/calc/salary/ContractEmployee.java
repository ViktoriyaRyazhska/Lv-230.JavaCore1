package yaremchuk.olga.inheritance.calc.salary;

public class ContractEmployee extends Employee implements PaymentCalc{
	String federalTaxIdmember;
	public int hours;
	public int hourlyRate;
	public int salary;
	
	
	public ContractEmployee() {}

	public ContractEmployee(String employeeld, int iD, String name, String federalTaxIdmember, int hours, int hourlyRate) {
		super(employeeld, iD, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void calculatePay() {
		salary = hourlyRate * hours;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", hours=" + hours + ", hourlyRate="
				+ hourlyRate + ", salary=" + salary + ", employeeld=" + employeeld + ", ID=" + ID + ", name=" + name
				+ "]";
	}
	
	

}
