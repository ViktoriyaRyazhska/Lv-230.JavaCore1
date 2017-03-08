package ert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.Messaging.SyncScopeHelper;

public class Person {

	private String name;
	private int birthYear;
	
	public Person() {
		
	}

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

	public Person(String name, int birthYear) {
		
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void age(int thisYear){
		System.out.println(thisYear-birthYear);
		
	}
	
	public void input() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name:");
		this.name=br.readLine();
		
		System.out.println("Enter the birthday year:");
		this.birthYear=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Successful");
		
	}
	
	public void output(){
		
		System.out.println("Hi. It's "+name+". The birthday year is " +birthYear);
	}
	
	public void changeName() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of Person to change:");
		
		this.name = br.readLine();
		
		System.out.println(" Successful");
	}
}
