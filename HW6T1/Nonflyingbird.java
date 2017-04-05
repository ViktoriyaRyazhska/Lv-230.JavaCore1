package HW6T1;

public class Nonflyingbird  extends Bird{
	public Nonflyingbird() {
		super();
	}
	public Nonflyingbird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	void fly() {
		System.out.println("I'm bird, but I'm not flying.");	
	}
}