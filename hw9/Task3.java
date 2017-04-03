package qwe;

public class Task3 implements Runnable{
	
	String name;
	
	
	
	
	
	public Task3(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public void run() {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(name);
		
		
	}

	
	
	
}
