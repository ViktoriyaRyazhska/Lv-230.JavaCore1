
public class ContractEmployee extends Employee implements Calculate {
	private String federalTaxIdmember;
	private int hourlyRate;
	private int numberOfHoursWorked;
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public ContractEmployee(String employeeID, String name, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
		super(employeeID, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		}
	@Override
	public int calculatePay() {
		return hourlyRate * numberOfHoursWorked;
	}
	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", hourlyRate=" + hourlyRate
				+ ", numberOfHoursWorked=" + numberOfHoursWorked + "]";
	}
	

}
