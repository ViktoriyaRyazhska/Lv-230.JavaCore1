package com.edu;

import java.util.Scanner;

public class ThreeIntegerNumbersMain {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers: ");
		
		Scanner scan = new Scanner(System.in);
		
		ThreeIntegerNumbers calc = new ThreeIntegerNumbers(scan.nextInt(),scan.nextInt(),scan.nextInt());

		calc.logicForMinNumber();
		calc.logicForMaxNumber();
	}

}
