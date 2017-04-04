package com.edu;

import java.util.Scanner;

public class ErrorsMain {

	public static void main(String[] args) {
		
		System.out.println("Input the number of the error: ");
		
		Scanner input = new Scanner(System.in);
		
		 ErrorsClass errorHTTP = new ErrorsClass(input.nextInt());
		 
		 errorHTTP.logicErrors();
	}

}
