package HW6T1;

public class Main {
	public static void main(String[] args) {
		Bird [] bird =new Bird[4];
		bird [0] = new Eagle();
		bird [0].feathers = "yes";
		bird [0].layEggs = 3;
		
		bird [1] = new Swallow();
		bird [1].feathers = "yes";
		bird [1].layEggs = 4;
		
		bird [2] = new Penguin();
		bird [2].feathers = "no";
		bird [2].layEggs = 5;
		
		bird [3] = new Kiwi();
		bird [3].feathers = "yes";
		bird [3].layEggs = 6;
		for(int i=0; i<bird.length;i++){
			System.out.println(bird[i]);
			bird[i].fly();
		}
}
}
