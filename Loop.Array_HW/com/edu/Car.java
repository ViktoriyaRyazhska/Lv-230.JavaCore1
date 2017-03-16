package com.edu;

public class Car {
	
private String type;
private int yearOfProduction;
private double engineCapasity;

public Car(String type, int yearOfProduction, double engineCapasity) {
	this.type = type;
	this.yearOfProduction = yearOfProduction;
	this.engineCapasity = engineCapasity;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public int getYearOfProduction() {
	return yearOfProduction;
}
public void setYearOfProduction(int yearOfProduction) {
	this.yearOfProduction = yearOfProduction;
}
public double getEngineCapasity() {
	return engineCapasity;
}
public void setEngineCapasity(double engineCapasity) {
	this.engineCapasity = engineCapasity;
}

@Override
public String toString() {
	return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapasity=" + engineCapasity + "]";
}
}
