package yaremchuk.olga.threads.running;

public class ThreadsRunning {

	public static void main(String s[]) {

		Thread one = new Thread(){
			public void run(){
				Thread two = new Thread(){
					public void run(){
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number two");
						}
						Thread three = new Thread(){
							public void run(){
								for (int i = 0; i < 5; i++) {
									System.out.println("Thread number three");
								}
							}
						};
						three.start();
					}
				};
				two.start();
			}
		};
		
	one.start();
	
	
		
		
	}//end main

}
