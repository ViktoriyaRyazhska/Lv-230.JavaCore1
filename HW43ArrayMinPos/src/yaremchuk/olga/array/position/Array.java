package yaremchuk.olga.array.position;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		int array [] = new int [5];
		int count = 0; //counter
		int positivePos = -1;
		int minPos = 0;
		int min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 10 integer numbers ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0){
				count++;
				if(count == 2){
					positivePos = i;
					break;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(min > array[i]){
				min = array[i];
				minPos = i;
			}
		}
		
		if (positivePos == -1){
			System.out.println("There are no two positive numbers in the array.");
		}else{
			System.out.println("Position of the second positive number is " + positivePos);
		}
		
		System.out.println("Minimum number is " + min+ " and it's position is " + minPos);
		
		
		
	}

}
