package yaremchuk.olga.array.entering;

import java.util.Scanner;

public class ArrayEntering {

	public static void main(String[] args) {
		
		int prod = 1; //product
		int temp = 1; // it is just temporary variable
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter any integer numbers ");
		
		while (temp >=0){
			temp = Integer.parseInt(sc.nextLine());
			prod *= temp;
		}
		
		sc.close();
		
		System.out.println("the product of all numbers is " + prod);

	}

}
