package hw6_part2;

public class SalariedEmployee extends Employee  implements Interf {

	double hourly_rate;
	int numberOfhw;
	int socialSecurityNumber;
	
	
	
	@Override
	public void calculatePay() {
		System.out.println("salary is" + hourly_rate * numberOfhw);
		
	}



	

	public SalariedEmployee(double hourly_rate, int numberOfhw, int socialSecurityNumber) {
	
		this.hourly_rate = hourly_rate;
		this.numberOfhw = numberOfhw;
		this.socialSecurityNumber = socialSecurityNumber;
	}





	@Override
	public String toString() {
		return "SalariedEmployee [hourly_rate=" + hourly_rate + ", numberOfhw=" + numberOfhw + "]";
	}

	
	
	
	
	
	
	
	
	
}
