package sdsd;

public class Main {

	public static void main(String[] args) {
		
		
		Bird [] bird = new Bird[4];
		
		bird[0] = new Eagle();
		bird[1] = new Swallow();
		bird[2] = new Penguin();
		bird[3] = new Chicken();
		
		
		for (int i = 0; i < bird.length; i++) {
			bird[i].fly();
			System.out.println(bird[i]);
		}

	}

}
