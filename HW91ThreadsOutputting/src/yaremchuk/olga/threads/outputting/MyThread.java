package yaremchuk.olga.threads.outputting;

public class MyThread extends Thread{
	private int number;
	private int pause;
	
	public MyThread(int number, int pause){
		this.number = number;
		this.pause = pause;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				sleep(pause);
			}catch(InterruptedException e){}
			
			System.out.println("This is message number - " + (i+1) + " of the thread number - "  + number);
		
		}
		
	}

}
