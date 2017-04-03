package yaremchuk.olga.inheritance.birds;

public class DifferentBirds {
	public static void main(String[] args) {
		
		Bird birds[] = new Bird[4];
		birds[0] = new Eagle("grey and white", 2);
		birds[1] = new Swallow("black and white", 4);
		birds[2] = new Penguin("black and white", 2);
		birds[3] = new Kiwi("grey or brown", 3);
		
		for (Bird bird : birds) {
			bird.fly();
			System.out.println(bird.toString());	
		}
	}

}
