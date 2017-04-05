package HW6T1;

public abstract class Bird {
	public String feathers;
	public int layEggs; 
	public Bird(){}
	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	abstract void fly();
}

