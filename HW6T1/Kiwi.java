package HW6T1;

public class Kiwi extends Nonflyingbird{
	
	public Kiwi() {
		super();
	}
	public Kiwi(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	void fly() {
		System.out.println("I'm kiwi");
	}
	public String toString() {
		return "Kiwi [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
}
