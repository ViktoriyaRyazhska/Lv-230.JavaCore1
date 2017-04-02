package task1task2task3;

public class OneThread extends Thread {

	private int threadNumber;
	
	public OneThread() {
		
	}
	
	
	public OneThread(int threadNumber) {
	
		this.threadNumber = threadNumber;
	}

	

	public int getThreadNumber() {
		return threadNumber;
	}


	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}


	@Override
	public void run() {
	
		for (int i = 0; i < threadNumber; i++) {
			System.out.println("Thread number two");
		}
		Runnable r1 = new MyThread(5, "Thread number three");
		Thread twoThread = new Thread(r1);
		twoThread.start();
		
		
	}
	
}
