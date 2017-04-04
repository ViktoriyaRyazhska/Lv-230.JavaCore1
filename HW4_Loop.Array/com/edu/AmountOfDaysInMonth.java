package com.edu;

import java.util.Scanner;

public class AmountOfDaysInMonth {

	public static void main(String [] args){
	
	int [] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	System.out.println("Input the number of the month: ");
	
	Scanner scan = new Scanner(System.in);
	
	int number1 = scan.nextInt();
	
	System.out.println("This month have " + daysOfMonth[number1-1] + " days.");
	
	}
}

