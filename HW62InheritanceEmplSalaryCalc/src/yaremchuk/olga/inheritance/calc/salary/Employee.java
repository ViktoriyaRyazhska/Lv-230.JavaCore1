package yaremchuk.olga.inheritance.calc.salary;

import java.util.Iterator;

public class Employee implements PaymentCalc {
	
	public String employeeld;
	public int ID;
	public String name;
	int salary;
	
	public Employee(){}
	
	public Employee(String employeeld, int iD, String name) {
		super();
		this.employeeld = employeeld;
		ID = iD;
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void calculatePay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + ", ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void sortBySalary(Employee[] empl){ //sort descending
		Employee temp = new Employee();
		temp = empl[0];
		for (int i = 0; i < empl.length; i++) {
			for (int j = i; j < empl.length; j++) {
				if(empl[i].getSalary() < empl[j].getSalary()){
					temp = empl[i];
					empl[i] = empl[j];
					empl[j] = temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		Employee empl[] = new Employee[4];
		empl[0] = new SalariedEmployee("jgj", 121453, "Andrew", "12b34c72h");
		empl[1] = new SalariedEmployee("esf", 318459, "Peter", "12b84n73c");
		empl[2] = new ContractEmployee("jgj", 127364, "Roman", "12b89h27r", 25, 85); 
		empl[3] = new ContractEmployee("ytr", 146873, "Oleg", "12b89h27r", 28, 80); 
		
		for (Employee e : empl) {
			e.calculatePay();
		}
		
		sortBySalary(empl);
		
		for (Employee e : empl) {
			System.out.println(e.toString());
		}
		

	}

	
	

}
