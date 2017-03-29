
public class Car {
private String type;
private int year_of_production;
private int engine_capacity;
public Car(String type, int year_of_production, int engine_capacity) {
	super();
	this.type = type;
	this.year_of_production = year_of_production;
	this.engine_capacity = engine_capacity;

}
public int getYear(){
	return year_of_production;
}
public String getModel(){
	return type;
	
}
@Override
public String toString() {
	return "Car [type=" + type + ", year_of_production=" + year_of_production
			+ ", engine_capacity=" + engine_capacity + "]";
}




}
