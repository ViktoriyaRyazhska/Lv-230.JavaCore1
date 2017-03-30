package yaremchuk.olga.numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Numbers {
	
	public static boolean checkRange(float f){
		if ((f>-5)&(f<5)){
			return true;
		}else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		float f1;
		float f2;
		float f3;
		int i1;
		int i2;
		int i3;
		int max;
		int min;
		int numbError;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first float number ");
		f1 = Float.parseFloat(sc.nextLine());
		System.out.println("Enter the second float number ");
		f2 = Float.parseFloat(sc.nextLine());
		System.out.println("Enter the third float number ");
		f3 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Enter the first integer number ");
		i1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the second integer number ");
		i2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the third integer number ");
		i3 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the number of HTTP Error (integer number) ");
		numbError = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		max = i1;
		min = i1;
		
		if((checkRange(f1))&(checkRange(f2))&(checkRange(f3))){
			System.out.println("All float numbers belong to the range");
		}else{
			System.out.println("NOT all float numbers belong to the range");
		}
		
		if ((max < i2)&(max > i3)){
			max = i2;
		}else{
			if(max < i3){
				max = i3;
			}
		}
		
		if ((min > i2)&(min < i3)){
			min = i2;
		}else{
			if(min > i3){
				min = i3;
			}
		}
		
		System.out.println("Max int number = " + max);
		System.out.println("Min int number = " + min);
		
		switch (numbError){
		case 400:
			System.out.println(HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.println(HTTPError.UNAUTHORIZED);
			break;
		case 402:
			System.out.println(HTTPError.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(HTTPError.FORBIDDEN);
			break;
		case 404:
			System.out.println(HTTPError.NOT_FOUND);
			break;
		case 405:
			System.out.println(HTTPError.METHOD_NOT_ALLOWED);
			break;
		default:
			System.out.println("Sorry, this error not found.");
		}
		
	}//end main

}//end class
