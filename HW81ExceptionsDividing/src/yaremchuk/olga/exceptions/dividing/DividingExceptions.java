package yaremchuk.olga.exceptions.dividing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividingExceptions {
	public static int div(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter first int number ");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter second int number ");
			int b = Integer.parseInt(br.readLine());
			return a/b;
		}catch(NumberFormatException | IOException e){
			System.out.println("Wrong number format/ You must enter integer numbers.");
			return -1;
		}catch(ArithmeticException e){
			System.out.println("Arithmetical exception. You can't divide by 0 ");
			return -2;
		}
	}
	
	public static void main(String[] args) {
		
		int d = div();
		System.out.println(d);
		
		
		
		
	}

}
