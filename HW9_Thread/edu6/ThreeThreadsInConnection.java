package edu6;

public class ThreeThreadsInConnection extends Thread{
	    
	    private int count;
	    private String message;
	    private Thread thread;
	   
	    public ThreeThreadsInConnection(String message,int count, Thread thread) {
	        this.message = message;
	        this.thread = thread;
	        this.count = count;
	    }
	    public ThreeThreadsInConnection(String message, int count) {
	        this.message = message;
	        this.count = count;
	    }
	    public ThreeThreadsInConnection(Thread thread) {
	        this.thread = thread;
	    }
	    public String getText() {
	        return message;
	    }
	    public Thread getThread() {
	        return thread;
	    }
	    public int getCount() {
	        return count;
	    }
	    @Override
	    public void run() {
	        if(getThread() != null){
	            getThread().start();
	        }
	        for(int i=0; i<getCount(); i++){
	            System.out.println(getText());
	        }
	    }
	    public static void main(String[] args) {
	        Thread t3 = new ThreeThreadsInConnection("Thread number three", 5);
	        Thread t2 = new ThreeThreadsInConnection("Thread number two", 3, t3);
	        Thread t1 = new ThreeThreadsInConnection(t2);
	        t1.start();
	    }
	}


