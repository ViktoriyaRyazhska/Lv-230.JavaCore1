package yaremchuk.olga.inheritance.birds;

public class FlyingBird extends Bird{
	
	public FlyingBird() {
		super();
		
	}

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("I'm flyig bird! I can fly)))");
		
	}
	

}
