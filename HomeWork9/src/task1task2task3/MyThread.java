package task1task2task3;

public class MyThread implements Runnable {

	private int am;
	private String mass;
	
	
	
	public MyThread(int am, String mass) {
		
		this.am = am;
		this.mass = mass;
	}
	



	public int getAm() {
		return am;
	}




	public void setAm(int am) {
		this.am = am;
	}




	public String getMass() {
		return mass;
	}




	public void setMass(String mass) {
		this.mass = mass;
	}




	@Override
	public void run() {
		
		for (int i = 0; i < am; i++) {
			
			System.out.println(mass);
		}
		
		
	}

}
