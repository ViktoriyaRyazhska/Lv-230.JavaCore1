package com.edu;

import java.util.Scanner;

class CarMain {

	public static void main(String[] args) {
		
		Car [] cars = new Car[4];
		Car j = null;
		
		cars[0] = new Car("Audi Quattro", 2009, 1.0);
		cars[1] = new Car("BMW 550 Gran Turismo", 2008, 1.9);
		cars[2] = new Car("Chevrolet Aveo", 2008, 1.5);
		cars[3] = new Car("Daewoo Lanos", 2013, 1.8);
		
        Scanner input = new Scanner(System.in);
		
	    System.out.println("Please, enter the number of car's year: ");
	    
	    int a = input.nextInt();
	     
	    for(int i = 0; i < cars.length; i++)
	    {
	        if(cars[i].getYearOfProduction() == a)
	        {
	    	System.out.println("The certain model year is: " + cars[i].getType());
	    	j = cars[i];
	        }
	        else if(j == null && cars[i].getYearOfProduction() != a && i == cars.length){
	        	System.out.println("We don't have any certain models of this year!");
	        }
	    }

	    for (int b = 0; b < cars.length; b++) {
	    	for (int c = b + 1; c < cars.length; c++) {
	    		if (cars[b].getYearOfProduction() > cars[c].getYearOfProduction()) {
	    			j = cars[b];
	    			cars[b] = cars[c];
	    			cars[c] = j;
	    		}
	    	}
	    }
	    for (int d = 0; d < cars.length; d++) {
	    	System.out.println(cars[d].toString());
	    }
    }
}