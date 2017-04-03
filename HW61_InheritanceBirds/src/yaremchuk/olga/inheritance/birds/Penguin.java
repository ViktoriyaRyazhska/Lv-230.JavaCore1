package yaremchuk.olga.inheritance.birds;

public class Penguin extends NonFlyingBird{
	
	
	
	public Penguin() {
		super();
		
	}

	public Penguin(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("I'm penguin, I can't fly.");
		
	}

	@Override
	public String toString() {
		return "Penguin [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
}
