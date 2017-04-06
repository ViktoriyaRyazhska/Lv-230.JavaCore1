package yaremchuk.olga.threads.outputting;

public class ThreeThreads {

	public static void main(String[] args) throws Exception {
		Thread t1 = new MyThread(1, 50);
		Thread t2 = new MyThread(2, 100);
		Thread t3 = new MyThread(3, 150);
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		t3.start();
		
		
	}

}
