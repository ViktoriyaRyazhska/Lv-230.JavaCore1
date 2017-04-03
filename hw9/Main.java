package qwe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//----task1

		
//		Runnable r =new Task("hello", 200);
//		Thread t = new Thread(r);
//		
//		Runnable r1 = new Task("Forest", 250);
//		Thread t1 = new Thread(r1);
//		
//		Runnable r3 = new Task2("Go", 300);
//		Thread t2 = new Thread(r3);
//		
//		t.start();
//		t1.start();
//		t2.start();
		

	//---task2
		
//		Runnable r4 = new Task3("Go");
//		Thread t2 = new Thread(r4);
//		
//		Thread th = Thread.currentThread( );
//		
//		synchronized (th) {
//			Thread.yield();
//		}
//		
//		
//		t2.start();
//		synchronized (t2) {
//			Thread.yield();
//			
//		}
//		
//		t2.join();
//		
//		System.out.println("main");
		
		
		//--task3
		
//		Runnable r5 = new MyThread(3);
//		Thread one = new Thread(r5);
//		
//		
//		one.start();
		
		
		//--task4
		
		
		String [] r = new String[10];
		String fileName = "c:/file1.txt.txt";
		FileInputStream inFile;
		
		byte[] w = new byte[10];
		String fileName2 = "c:/file2.txt";
		FileOutputStream outFile;
		
		try {
			inFile = new FileInputStream(fileName);
			System.out.println("Input file was opened.");
			int bytesAv = inFile.available();     
			System.out.println("Bytes count: " + bytesAv + " Bytes");
			int count = inFile.read();
			System.out.println(count);
			
			outFile = new FileOutputStream(fileName2);
			System.out.println("Output file was opened.");
			outFile.write(w);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		

		
		
		
		
		
	}

}
