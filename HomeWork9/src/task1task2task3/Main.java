package task1task2task3;

public class Main {

	public static void main(String[] args) {

		// task 1

		Runnable r1 = new MyThread(5, "First thread");
		Thread t1 = new Thread(r1);

		Runnable r2 = new MyThread(5, "Second thread");
		Thread t2 = new Thread(r2);

		Runnable r3 = new MyThread(5, "Third thread");
		Thread t3 = new Thread(r3);

		 t1.start();
		 t2.start();
		 t3.start();

		// task2

		t1.start();
		synchronized (t1) {
			Thread.yield();
		}
		t2.start();

		synchronized (t2) {

		}
		t3.start();
		synchronized (t3) {

		}

//		// task3

		Runnable r4 = new OneThread(3);
		Thread t4 = new Thread(r4);
		t4.start();

	}

}
