package HW9;

public class Deadlock {	
 
public final static Object first = new Object();
public final static Object second = new Object();
public static void main(String [] args) {
   Thread t1 = new Thread() {	   
   public void run() {
      synchronized (first) {
         Thread.yield();
         synchronized (second) {
            System.out.println("Deadlock");
            } 
         } 
   }
   };
}}

