package edu6;

public class ThreeThreads extends Thread{

	private String message;

    public ThreeThreads(String message) {
        this.message = message;
        this.start();
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
    	ThreeThreads t1 = new ThreeThreads("First Thread");
    	ThreeThreads t2 = new ThreeThreads("Second Thread");
    	ThreeThreads t3 = new ThreeThreads("Third Thread");
    }
		}

	

