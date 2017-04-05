package HW6T1;

public class Flyingbird extends Bird{
	public Flyingbird() {
		super();	
	}
	public Flyingbird(String feathers, int layEggs) {
		super(feathers, layEggs);	
	}
	void fly() {
		System.out.println("I'm flyig bird! I can fly)))");	
	}
}