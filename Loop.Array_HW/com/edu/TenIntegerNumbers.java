package com.edu;

import java.util.Scanner;

public class TenIntegerNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int[10];
		
		 System.out.println("Insert ten numbers: ");
		
		for (int i = 0; i <= 9; i++) {
	        numbers[i] = scan.nextInt(); 
	    }
        
		for (int j = 0; j <= 4; j++){
			
			if(numbers[j] >= 0){
				
				int sum = 0;
				
				for (int k = 0; k <= 4; k++){
					
				sum = sum + numbers[k];
				
				if(j == 4 && k == 4){
					System.out.println("The sum of first five numbers is: "+ sum);
				    }
				  }
				}
		
			else{
				
				int product = 1;
				
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
