package com.edu;

import java.util.Scanner;

public class ThreeFloatNumbersMain {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers: ");
		
		Scanner scan = new Scanner(System.in);
		
		ThreeFloatNumbers three = new ThreeFloatNumbers(scan.nextFloat(),scan.nextFloat(),scan.nextFloat());
		
		three.logic();

	}

}
