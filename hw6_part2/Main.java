package hw6_part2;

public class Main {

	public static void main(String[] args) {
		
		//Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld. Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
		//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
		//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
		//Include a description of federalTaxIdmember in the class of contractEmployee .
		//The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
		//For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“
		
		
		
		Employee[] empl = new Employee[4];
		
		empl[0] = new SalariedEmployee(55, 180, 3);
		empl[1] = new SalariedEmployee(70, 185,5);
		empl[2] = new ContractEmployee(5000, 6);
		empl[3] = new ContractEmployee(7000, 9);

		
		
		
		
		
		
		for (int i = 0; i < empl.length; i++) {
			if(empl[i] instanceof SalariedEmployee){
				((SalariedEmployee)empl[i]).calculatePay();
			}
		}
		
		for (int i = 0; i < empl.length; i++) {
			if(empl[i] instanceof ContractEmployee){
				((ContractEmployee)empl[i]).calculatePay();
			}
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
							
		
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
