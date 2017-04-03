package yaremchuk.olga.inheritance.birds;

public class Kiwi extends NonFlyingBird{
	
	public Kiwi() {
		super();
	}

	public Kiwi(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("I'm kiwi, I can't fly.");
		
	}

	@Override
	public String toString() {
		return "Kiwi [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
}
