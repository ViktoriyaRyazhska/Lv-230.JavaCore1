package com.edu;

public class Employee {
	private String name;
	private int rate;
	private int hours;

 static double totalSum = 0;
 static int totalHours = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getTotalHours() {
		  return totalHours;
		}
	
	public Employee() {
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += salary();
		totalHours += hours ;
		
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		totalSum += salary();
		
	}

	public double salary() {
		
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public void changeRate(int rate) {
		this.rate = rate;
	}

	public double bonuses() {
		return salary() * 0.1;
	}

}
