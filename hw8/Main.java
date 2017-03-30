package fgfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  {
		
		try {
			div(4.5, 5.8);
		} catch (MyException e) {
			System.out.println("number must be >0");
			e.printStackTrace();
		}
		
		
	
			try {
				readNumber(3, 10);
			} catch (NumberFormatException e) {
				System.out.println("you enter incorrect number");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Check the correctness of the input");
				e.printStackTrace();
			} catch (MyException2 e) {
				System.out.println("number is not in the range [start...end]"); 
			e.printStackTrace();
			}
	
		
		
		
		
		
		
		
		
		

	}
	
	//Create method div(), which calculates the dividing of two double numbers. 
	//In main method input 2 double numbers and call this method. Catch all exceptions. 

	public static void div(double a, double b) throws MyException{
		
		if(a>0&&b>0){
			System.out.println(a/b);
		}else{
			throw new MyException("number can not be < 0");
		}
	}
	
	//Write a method readNumber(int start, int end), that read from console integer number
	//and return it, if it is in the range [start...end]. 

	public static void readNumber (int start, int end) throws NumberFormatException, IOException, MyException2{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		
		int d;
		
			d = Integer.parseInt(br.readLine());
		
		if( d >= start && d <= end){
			
			System.out.println(d);
		}else{
			throw new MyException2("number is not in the range or not a number");
		}
		
	}
	
	
	
	
	
	
	
	
	

}
