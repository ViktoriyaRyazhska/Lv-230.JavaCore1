package HW6T1;

public class Eagle extends Flyingbird{
	public Eagle() {
		super();	
	}
	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	void fly() {
		System.out.println("I'm eagle ");
	}
	public String toString() {
		return "Eagle [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
}
