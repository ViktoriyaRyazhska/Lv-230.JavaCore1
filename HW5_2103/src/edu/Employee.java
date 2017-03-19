package edu;

public abstract class Employee {
	
	private String employeeld;
	private String name;

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}
	
	

}
