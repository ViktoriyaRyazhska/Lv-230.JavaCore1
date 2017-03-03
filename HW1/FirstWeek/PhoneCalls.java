package com.edu;

import java.util.Scanner;

public class PhoneCalls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input c1: ");
		
		double c1 = sc.nextDouble();
		
        System.out.println("Input c2: ");
		
        double c2 = sc.nextDouble();
		
        System.out.println("Input c3: ");
		
        double c3 = sc.nextDouble();

        System.out.println("Input t1: ");
		
        double t1 = sc.nextDouble();
		
        System.out.println("Input t2: ");
		
        double t2 = sc.nextDouble();
		
        System.out.println("Input t3: ");
		
        double t3 = sc.nextDouble();
		
		double price1=c1*t1;
		double price2=c2*t2;
		double price3=c3*t3;
		
		double sumOfCalls = price1 + price2 + price3;
		
		System.out.println("price1: " + price1 + "; price2: " + price2 + "; price3: " + price3 +"; Sum of all calls: " + sumOfCalls);
	}

}
