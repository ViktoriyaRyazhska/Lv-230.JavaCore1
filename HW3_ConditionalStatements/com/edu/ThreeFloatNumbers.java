package com.edu;

public class ThreeFloatNumbers {
	
	 private float  number1;
	 private float  number2;
	 private float  number3;

	 public ThreeFloatNumbers() {
	 }
	 
	public ThreeFloatNumbers(float number1, float number2, float number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
		public String logic(){
		if((-5 <= number1) && (number1 <= 5) &&
		   (-5 <= number2) && (number2 <= 5) && 
		   (-5 <= number3) && (number3 <= 5))
		{
		 System.out.println("All three numbers are belong to the range [-5;5]");
		 return "All three numbers are belong to the range [-5;5]";
		}
		else{
		System.out.println("All three numbers are not belong to the range [-5;5]");	
		return "All three numbers are not belong to the range [-5;5]";
	}
	}
}
