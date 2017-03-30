package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			div();
		} catch (NumberFormatException e) {
			System.err.println("Wrong format number");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Wrong");
			e.printStackTrace();
		} catch (Myexep e) {
			System.err.println("b must not be zero");
			e.printStackTrace();
		}


	}

	public static void div() throws NumberFormatException, IOException, Myexep{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number a");
		double a=Double.parseDouble(br.readLine());
		System.out.println("Enter number b");
		double b=Double.parseDouble(br.readLine());
		
		if (b==0) {
			throw new Myexep();
		} else {
			System.out.println("Result ="+ a/b);
		}
	
		
	}
}


