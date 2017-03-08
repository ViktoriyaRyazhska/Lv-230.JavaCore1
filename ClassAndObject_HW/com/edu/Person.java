package com.edu;

import java.util.Scanner;

public class Person {
	private String name;
	private int birthYear;
	private static int count = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public Person() {
		count++;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public int age(){
		int age = getCurrentYear() - birthYear;
		return age;
	};
	
	public static int getCurrentYear()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the name of the person ¹" + count + " : ");
		this.name = sc.nextLine();
		
		System.out.println("Input the year of birth of the person ¹" + count + " : ");
		this.birthYear = sc.nextInt();
		
	};
	
	public void output(){
		
		System.out.println("Person: " + name + ", " + name + " Year of birth: " + birthYear + ".");
	};
	
	public void changeName(String name){
		this. name = name;
	};
	
}
