package HW4;
public class Car {
	private String type;
	private int yearOfProduct;
	private int engineCapacity;
	public Car() {
	}
	public Car(String type, int yearOfProduct, int engineCapacity) {
	
		this.type = type;
		this.yearOfProduct = yearOfProduct;
		this.engineCapacity = engineCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearOfProduct() {
		return yearOfProduct;
	}
	public void setYearOfProdact(int yearOfProduct) {
		this.yearOfProduct = yearOfProduct;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineCapacity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProduct;
		return result;
	}
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
		if (yearOfProduct != other.yearOfProduct)
			return false;
		return true;
	}
	public String toString() {
		return "Car [type=" + type + ", yearOfProduct=" + yearOfProduct + ", engineCapacity=" + engineCapacity + "]";
	}
}

