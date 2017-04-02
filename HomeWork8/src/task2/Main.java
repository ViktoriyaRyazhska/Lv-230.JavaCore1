package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			readNumber(0, 100);
		} catch (NumberFormatException | IOException e) {
			System.err.println("Format error");
			e.printStackTrace();
		}
		

	}
	
	private static  void readNumber(int start, int end) throws NumberFormatException, IOException{
		
		System.out.println("Enter 10 number to check");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("Enter number");
			number[i] = Integer.parseInt(br.readLine());	
		}
		
		for (int i = 0; i < number.length; i++) {
			if ((number[i]< end && number[i] > start)) {
				System.out.print(number[i]+" ");
			}
			if(!(number[i]< end && number[i] > start)){
				throw new ArithmeticException(number[i]+"Not in range");
				
			} 
		}
	
		
	}

}
