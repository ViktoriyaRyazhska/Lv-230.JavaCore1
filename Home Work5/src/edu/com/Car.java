package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
	
	private String type;


	private int yearOfProdact;
	private int engineCapac;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String type, int yearOfProdact, int engineCapac) {
		
		this.type = type;
		this.yearOfProdact = yearOfProdact;
		this.engineCapac = engineCapac;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProdact() {
		return yearOfProdact;
	}

	public void setYearOfProdact(int yearOfProdact) {
		this.yearOfProdact = yearOfProdact;
	}

	public int getEngineCapac() {
		return engineCapac;
	}

	public void setEngineCapac(int engineCapac) {
		this.engineCapac = engineCapac;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineCapac;
		result = prime * result + yearOfProdact;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engineCapac != other.engineCapac)
			return false;
		if (yearOfProdact != other.yearOfProdact)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProdact=" + yearOfProdact + ", engineCapac=" + engineCapac + "]";
	}
	
	
	
		
	}
	


