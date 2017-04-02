package yaremchuk.olga.array.cars;

import java.util.Scanner;

public class Car {
	private String type;
	private int yearProd; //year of prodaction
	private int engCapac;
	
	public Car() {}
	
	public Car(String type, int yearProd, int engCapac) {
		this.type = type;
		this.yearProd = yearProd;
		this.engCapac = engCapac;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearProd() {
		return yearProd;
	}
	public void setYearProd(int yearProd) {
		this.yearProd = yearProd;
	}
	public int getEngCapac() {
		return engCapac;
	}
	public void setEngCapac(int engCapac) {
		this.engCapac = engCapac;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engCapac;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearProd;
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
		if (engCapac != other.engCapac)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearProd != other.yearProd)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearProd=" + yearProd + ", engCapac=" + engCapac + "]";
	}
	
	public static void sortByYear(Car[] arr){
		Car temp = new Car();
		temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i].getYearProd() > arr[j].getYearProd()){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int year;
		Car car[] = new Car[4];
		car[0] = new Car ("Sedan", 2010, 45);
		car[1] = new Car ("Sport car", 2015, 30);
		car[2] = new Car ("Luxury car", 2017, 40);
		car[3] = new Car ("Diesel", 2010, 45);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the year of a car");
		year = Integer.parseInt(sc.nextLine());
		sc.close();
		sortByYear(car);
		
		System.out.println("The cars of " + year + " year is: ");
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearProd() == year){
				System.out.println(car[i].toString());
			}
		}
		
		System.out.println("After sorting by year:");
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].toString());
		}
	}

}
