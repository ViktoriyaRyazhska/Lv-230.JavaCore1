package qwe;

public class Task implements Runnable{
	
	String name;
	int time;
	
	public Task(String name, int time) {
		
		this.name = name;
		this.time = time;
	}
	
	public void run(){
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(name);
			
		}
	}
	
	
	

}
