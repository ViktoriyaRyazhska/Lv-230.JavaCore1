package com.edu;

import java.util.Scanner;

class CarMain {

	public static void main(String[] args) {
		
		Car [] cars = new Car[5];
		
		cars[0] = new Car("Audi Quattro", 2017, 1.0);
		cars[1] = new Car("BMW 550 Gran Turismo", 2008, 1.9);
		cars[2] = new Car("Chevrolet Aveo", 1999, 1.5);
		cars[3] = new Car("Daewoo Lanos", 2013, 1.8);
		
		
        Scanner input = new Scanner(System.in);
		
	    System.out.println("Please, enter the number of car's year: ");
	    
	    int a = input.nextInt();
	    
	    for(int i = 0;i < 4; i++)
	    {
	        if(cars[i].getYearOfProduction() == a)
	        {
	    	System.out.println("The certain model year is: " + cars[i].getType());
	    	break;
	        }
	        else if(i == 3 && cars[i].getYearOfProduction() != a){
	        	System.out.println("We don't have any certain models of this year!");
	        }
	    }

	    for (int b = 0; b < 4; b++) {
	    	for (int c = b + 1; c < 4; c++) {
	    		if (cars[b].getYearOfProduction() > cars[c].getYearOfProduction()) {
	    			cars[4] = cars[b];
	    			cars[b] = cars[c];
	    			cars[c] = cars[4];
	    		}
	    	}
	    }
	    for (int d = 0; d < 4; d++) {
	    	System.out.println(cars[d].toString());
	    }
    }
}