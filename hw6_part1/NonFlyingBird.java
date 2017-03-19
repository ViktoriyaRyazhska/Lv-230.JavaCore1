package sdsd;

public class NonFlyingBird extends Bird {
	String nameOfBird;
	int speed;
	
	
	@Override
	public void fly() {
		System.out.println("I am NonFlyingBird");
		
	}


	@Override
	public String toString() {
		return "NonFlyingBird [nameOfBird=" + nameOfBird + ", speed=" + speed + "]";
	}

	
	
}
