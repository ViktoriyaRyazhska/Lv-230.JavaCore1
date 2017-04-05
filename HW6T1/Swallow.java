package HW6T1;

public class Swallow extends Flyingbird{
	public Swallow() {
		super();
	}
	public Swallow(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	void fly() {
		System.out.println("I'm swallow ");
	}
	public String toString() {
		return "Swallow [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
}
