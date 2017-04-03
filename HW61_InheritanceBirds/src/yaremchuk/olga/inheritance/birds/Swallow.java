package yaremchuk.olga.inheritance.birds;

public class Swallow extends FlyingBird{
	
	public Swallow() {
		super();
	}

	public Swallow(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("I'm swallow and I can fly)))");
		
	}

	@Override
	public String toString() {
		return "Swallow [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
	
}
