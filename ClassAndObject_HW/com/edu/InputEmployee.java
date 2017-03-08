package com.edu;

public class InputEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Andrij", 15, 6);

		System.out.println(emp1);
		
		Employee emp2 = new Employee("Borys", 10, 5);
		
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Vasyl", 17, 8);

		System.out.println(emp3);
		
		System.out.println("The total hours of all workers: " + Employee.totalHours);

		/*code below is not required in condition, but we should use this for
		 * testing the program:
		 */ 
		// System.out.println();
		// emp1.changeRate(55);
		// System.out.println(emp1); 
		// System.out.println("Salary: " + emp1.salary()); 
		// System.out.println("Bonus: " + emp1.bonuses());
	}

}
