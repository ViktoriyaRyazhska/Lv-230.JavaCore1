package com.edu;

import java.util.Scanner;

public class TenIntegerNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int product = 1;
		
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int[10];
		
		 System.out.println("Insert ten numbers: ");
		
		for (int i = 0; i <= 9; i++) {
	        numbers[i] = scan.nextInt(); 
	    }
        
		for (int j = 0; j <= 4; j++){
			
			if(numbers[j] >= 0){
				
				sum = sum + numbers[j];
				
				if(j == 4){
					System.out.println("The sum of first five numbers is: " + sum);
				    }
				  }
			else{
				
				for(j = 5; j <= 9; j++){
					
					product = product*numbers[j];
					
					if(j == 9){
						System.out.println("The product of five last numbers is: "+ product);
					}
				}
			}
		}
	}
}
