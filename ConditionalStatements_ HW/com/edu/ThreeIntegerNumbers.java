package com.edu;

public class ThreeIntegerNumbers {

	private int maxNumber;
	private int minNumber;
	
	private int number1;
	private int number2;
	private int number3;
	
	public ThreeIntegerNumbers(int number1, int number2, int number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
		public int logicForMinNumber(){
		
		    minNumber = number1 < number2 ? number1 : number2;
		    minNumber = number3 < minNumber ? number3 : minNumber;
		
		    System.out.println("The least number is: " + minNumber);
		
		    return minNumber;
		}
		
		public int logicForMaxNumber(){
			
			maxNumber = number1 > number2 ? number1 : number2;
			maxNumber = number3 > maxNumber ? number3 : maxNumber;
			
			System.out.println("The highest number is: " + maxNumber);
			
			return maxNumber;
		}
}
