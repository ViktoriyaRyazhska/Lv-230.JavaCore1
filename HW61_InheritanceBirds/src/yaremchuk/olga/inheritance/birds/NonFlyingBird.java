package yaremchuk.olga.inheritance.birds;

public class NonFlyingBird extends Bird{
	
	public NonFlyingBird() {
		super();
		
	}

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("I'm bird, but I'm not flying.");
		
	}
	
	
	
}
