package edu;

public class Main {

	public static void main(String[] args) {
		
		
		Employee[] employees =  new Employee[4];
		
		employees[0]= new SalariedEmployee(180, 10.5, "123456789");
		employees[0].setEmployeeld("123");
		employees[0].setName("Vova");
		employees[1]= new SalariedEmployee(160, 15.5, "987654321");
		employees[1].setEmployeeld("321");
		employees[1].setName("Stepa");
		employees[2]= new ContractEmployee(3987);
		employees[2].setEmployeeld("789");
		employees[2].setName("Anton");
		employees[3]= new ContractEmployee(4785);
		employees[3].setEmployeeld("987");
		employees[3].setName("Ira");
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println("employee ID :"+employees[i].getEmployeeld()+" "+"Employee name is " +employees[i].getName());
			
			if (employees[i] instanceof SalariedEmployee) {
				((SalariedEmployee)employees[i]).calculatePay();
			}else {if (employees[i] instanceof ContractEmployee) {
				((ContractEmployee) employees[i]).calculatePay();
			}
				
			}
		}
		
		
	
		
		
	}

}
