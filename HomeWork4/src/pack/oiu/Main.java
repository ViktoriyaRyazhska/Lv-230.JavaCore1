package pack.oiu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

//		// 1.Solve the next tasks:
//
//		// read 3 float numbers and check: are they all belong to the range
//		// [-5,5];
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("Enter a1,a2,a3");
//		float a1 = Float.parseFloat(br.readLine());
//		float a2 = Float.parseFloat(br.readLine());
//		float a3 = Float.parseFloat(br.readLine());
//
//		if (a1 >= -5 && a1 <= 5 && a2 >= -5 && a2 <= 5 && a3 >= -5 && a3 <= 5) {
//			System.out.println("all belong to the range [-5,5]");
//		} else {
//			System.out.println("all not belong to the range [-5,5]");
//		}
//
//		// read 3 integer numbers and write max and min of them;
//
//		System.out.println("Enter b1,b2,b3");
//		int b1 = Integer.parseInt(br.readLine());
//		int b2 = Integer.parseInt(br.readLine());
//		int b3 = Integer.parseInt(br.readLine());
//
//		if (b1 > b2 && b1 > b3) {
//			System.out.println(b1 + "is max");
//		} else {
//			if (b2 > b3) {
//				System.out.println(b2 + "is max");
//			} else {
//				System.out.println(b3 + "is max");
//			}
//
//		}
//
//		if (b1 < b2 && b1 < b3) {
//			System.out.println(b1 + "is min");
//		} else {
//			if (b2 < b3) {
//				System.out.println(b2 + "is min");
//			} else {
//				System.out.println(b3 + "is min");
//			}
//
//		}
//
//		// read number of HTTP Error (400, 401,402, ...) and write the name of
//		// this error (Declare enum HTTPError)
//
//		System.out.println("Enter number of HTTP Error ");
//		switch (Integer.parseInt(br.readLine())) {
//		case 400:
//			System.out.println(HTTPError.Bad_Request.name());
//			break;
//		case 401:
//			System.out.println(HTTPError.Unauthorized.name());
//			break;
//		case 402:
//			System.out.println(HTTPError.Payment_Required.name());
//			break;
//		case 403:
//			System.out.println(HTTPError.Forbidden.name());
//			break;
//
//		default:
//			System.out.println("This is not an error");
//			break;
//		}

		// Сreate class Dog with fields name, breed, age.
		// Declare enum for field breed.
		// Create 3 instances of type Dog.
		// Check if there is no two dogs with the same name.
		// Display the name and the kind of the oldest dog.

		Breed breed = null;

		Dog dog1 = new Dog("kuzia", breed.Beagle, 7);
		Dog dog2 = new Dog("tuzik", breed.Dalmatian, 9);
		Dog dog3 = new Dog("barsik", breed.Husky, 5);

		if (dog1.equals(dog2)||dog1.equals(dog3)) {
			System.out.println("They are have the same names");
			
		} else {if (dog2.equals(dog3)) {
			System.out.println("They are have the same names");
		} else {
			System.out.println("They are haven't the same names");
		}
		 System.out.println("They are haven't the same names");
		}

		
		
		//не закінчив
	}
}
