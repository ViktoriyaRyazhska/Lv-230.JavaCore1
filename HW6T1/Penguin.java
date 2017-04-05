package HW6T1;

public class Penguin extends Nonflyingbird{
	
	
	
	public Penguin() {
		super();
		
	}

	public Penguin(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	
	void fly() {
		System.out.println("I'm penguin");
		
	}


	public String toString() {
		return "Penguin [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
}