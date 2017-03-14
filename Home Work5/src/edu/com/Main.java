package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Ask user to enter the number of month. Read the value and write the
		// amount of days in this month (create array with amount days of each
		// month).
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of month ");
		System.out.println();
		month(Integer.parseInt(br.readLine()));

		// Enter 10 integer numbers. Calculate the sum of first 5 elements if
		// they are positive or product of last 5 element in the other case.

		calcSum(10);

		// Enter 5 integer numbers. Find
		// position of second positive number;

		positNumb(5);

		// minimum and its position in the array.

		minVal(5);

		// Organize entering integers until the first negative number. Count the
		// product of all entered even numbers.

		negativeNumb(5);

		// Create class Car with fields type, year of production and engine
		// capacity. Create and initialize four instances of class Car. Display
		// cars
		// certain model year (enter year in the console);
		// ordered by the field year.

		Car[] cars = new Car[4];

		cars[0] = new Car("Bmw",1988, 1500);
		cars[1] = new Car("opel",1970, 1400);
		cars[2] = new Car("mers",1988, 1300);
		cars[3] = new Car("vaz",1996, 1800);

	
		System.out.println("Enter year: ");
		int year = Integer.parseInt(br.readLine());

		for (int i = 0; i < cars.length; i++) {
			if (year == cars[i].getYearOfProdact()) {
				System.out.println(cars[i]);
			}
		}
		
		
		Car tmpY;
		
		for (int i = 0; i < cars.length-1; i++) {
			for (int j = i+1; j < cars.length; j++) {
				if (cars[i].getYearOfProdact()<cars[j].getYearOfProdact()) {
					tmpY=cars[i];
					cars[i]=cars[j];
					cars[j]=tmpY;
					
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}
	
	// Ask user to enter the number of month. Read the value and write the
		// amount of days in this month (create array with amount days of each
		// month).

		public static void month(int numbMonth) {
			int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			for (int i = 0; i < month.length; i++) {

				if (i == numbMonth - 1) {
					System.out.println(month[i]);
				}
			}
		}

		// Enter 10 integer numbers. Calculate the sum of first 5 elements if they
		// are positive or product of last 5 element in the other case.

		public static void calcSum(int y) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number. Press Enter after each");

			int[] x = new int[y];
			int sum = 0;
			int posit = 0;
			for (int j = 0; j < x.length; j++) {
				x[j] = Integer.parseInt(br.readLine());

			}
			for (int i = 0; i < x.length; i++) {
				if (x[i] > 0) {
					sum += x[i];
					posit++;
					if (posit == 5) {
						System.out.println("sum of first 5 positive elements " + sum);
						break;
					}
				}
				// else {
				// if (i>4) {
				// System.out.println(x[i]);
				// break;
				// }
				//
				// }
			}

		}

		public static void positNumb(int x) throws NumberFormatException, IOException {
			int[] arr = new int[x];
			int posit = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number. Press Enter after each");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] > 0) {
					posit++;
					if (posit == 2) {
						System.out.println("position of second positive number is " + i);
					}
				}

			}

		}

		public static void minVal(int x) throws NumberFormatException, IOException {
			int[] arr = new int[x];
			int min = arr[0];
			int minI = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number. Press Enter after each");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());

			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					minI = i;
				}
			}
			System.out.println("min = " + min + "Index is " + minI);
		}

		public static void negativeNumb(int x) throws NumberFormatException, IOException {
			int[] arr = new int[x];
			int count = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number. Press Enter after each");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				if (arr[i] < 0) {
					break;
				}

			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] / 2 != 0) {
					count++;
				}

			}
			System.out.println("count of all entered even numbers is " + count);
		}
}
