package com.edu;

import java.util.Scanner;

public class FiveIntegerNumbersMain {

	public static void main(String[] args) {

		System.out.println("Insert five numbers: ");
		
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int[5];
		
		for (int i = 0; i <= 4; i++) 
		{
	        numbers[i] = scan.nextInt(); 
	    }
		
		int secondPositive = 0;
		int min = numbers[0]; 
		int imin = 0;
		
		for(int a = 0; a < 4; a++)
		{
			if(secondPositive == a + 2)
			{
				break;
			}
			else if(numbers[a] > 0)
			{
				while(a + 1 <= 4)
				{
					if(numbers[a + 1] > 0)
					{
						secondPositive = a + 2;
						
						System.out.println("Position of second positive number is: " + secondPositive);
						break;
					 }
					else 
					{
						a++;
					continue;
					 }
				 }
			}
			else if(a == 3)
			{
				System.out.println("There are no two positive numbers!");
			}
		}
			
		for(int j = 0; j <= 4; j++)
		{
			if (numbers[j] < min)
			{
				min = numbers[j];
				 imin = j;
			} 
		}
		System.out.println("Minimal number is: " + min + " its position is: " + (imin+1));
	}

}
