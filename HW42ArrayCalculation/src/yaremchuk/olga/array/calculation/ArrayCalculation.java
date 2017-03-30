package yaremchuk.olga.array.calculation;

import java.util.Scanner;

public class ArrayCalculation {

	public static void main(String[] args) {
		int array [] = new int [10];
		int sum = 0;
		int prod = 1; //product
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter 10 integer numbers ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		for (int i = 0; i < array.length; i++) {
			if ((i < 5)&(array[i]>0)){
				sum +=array[i];
				count ++;
			}else{
				if ((count < 5)&(i > 4)){
					prod *= array[i];
				}
			}
		}
		
		if (count == 5){
			System.out.println("The sum of first five positive elements = " + sum);
		}else{
			System.out.println("The product of last five elements = " + prod);
		}

	}

}
