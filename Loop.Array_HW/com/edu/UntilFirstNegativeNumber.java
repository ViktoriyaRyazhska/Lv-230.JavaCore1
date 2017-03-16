package com.edu;

import java.util.Scanner;

public class UntilFirstNegativeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Please, enter the number: ");
	    
	    int product = 1;
	    
	    for(int i = 0;i < i+1;i++){
	    	
	    	int j = input.nextInt();
	    	
	    	if(j >= 0){
	    		product = product*j;
	    	}
	    	else if(i == 0 && j < 0){
	    		System.out.println("You have not entered any of positive numbers!");
	    	}
	    	else{
	    		System.out.println("The product of all positive numbers is: " + product);
	    		break;
	    	}
	    }

	}

}
