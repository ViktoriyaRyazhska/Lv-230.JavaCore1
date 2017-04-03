
public class Main {

	public static void main(String[] args) {
		Bird [] bird =new Bird[4];
		bird [0] = new Eagle();
		bird [0].feathers = "Yes";
		bird [0].layEggs = 4;
		
		bird [1] = new Swallow();
		bird [1].feathers = "yes";
		bird [1].layEggs = 6;
		
		bird [2] = new Penguin();
		bird [2].feathers = "no";
		bird [2].layEggs = 7;
		
		bird [3] = new Chicken();
		bird [3].feathers = "no";
		bird [3].layEggs = 9;
		
		for(int i=0; i<bird.length;i++){
			System.out.println(bird[i]);
			bird[i].fly();
			
		}
		
	
}
}