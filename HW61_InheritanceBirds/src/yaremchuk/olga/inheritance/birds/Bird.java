package yaremchuk.olga.inheritance.birds;

public abstract class Bird {
	
	public String feathers;
	public int layEggs; //this attribute shows, how much eggs lay bird 
	
	public Bird(){}

	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	
	abstract void fly();
	
	
	
	
	
}
