package edf;

public class Car {
	
	private String type;


	private int yearOfProdact;
	private int engineCapacity;
	
	
	
	public Car() {
		
	}



	public Car(String type, int yearOfProdact, int engineCapacity) {
	
		this.type = type;
		this.yearOfProdact = yearOfProdact;
		this.engineCapacity = engineCapacity;
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



	public int getEngineCapacity() {
		return engineCapacity;
	}



	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineCapacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (engineCapacity != other.engineCapacity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProdact != other.yearOfProdact)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProdact=" + yearOfProdact + ", engineCapacity=" + engineCapacity + "]";
	}
	
	
	
    
	

}
