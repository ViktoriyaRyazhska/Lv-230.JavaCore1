package yaremchuk.olga.inheritance.birds;

public class Eagle extends FlyingBird{
	
	public Eagle() {
		super();
		
	}

	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("I'm eagle and I can fly)))");
		
	}

	@Override
	public String toString() {
		return "Eagle [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
}
