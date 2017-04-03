package qwe;

public class Task2 implements Runnable {

	String name;
	int time;
	
	
	
	
	public Task2(String name, int time) {
	
		this.name = name;
		this.time = time;
	}




	@Override
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			
			
			System.out.println(name);
			
			
		}
		
	}
	
	

}
