package com.edu;

import java.util.Scanner;

public class WhatIsYourName {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = sc.nextLine();
		
		System.out.println("Where are you live, " + name + "?");
		
		String adress = sc.nextLine();
		int numberOfHouse = sc.nextInt();
		
		System.out.println("How old are you, " + name + "?");
		
		int age = sc.nextInt();

		
		System.out.println(name + ", you are " + age + " years old" + " , you adress is " + adress + ", " + numberOfHouse + " and you are perfect human!:)");
	}

}
