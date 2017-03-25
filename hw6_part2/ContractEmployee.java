package hw6_part2;

public class ContractEmployee extends Employee  implements Interf {

	int fixed_pay;
	int federalTaxIdmember;
	
	@Override
	public void calculatePay() {
		System.out.println("salary is  " + fixed_pay);
	}

	




	public ContractEmployee(int fixed_pay) {
		super();
		this.fixed_pay = fixed_pay;
	}






	public ContractEmployee(int fixed_pay, int federalTaxIdmember) {
	
		this.fixed_pay = fixed_pay;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	
	
	
	
	
	
	
	
}
