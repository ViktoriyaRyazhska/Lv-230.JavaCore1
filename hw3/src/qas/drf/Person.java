package qas.drf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	private String name;
	private int birthYear;
	
	
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
		
	}
	
	
	public Person(String name, int birthYear) {
		
		/*this.name = name;
		this.birthYear = birthYear;*/
	}
	
	public int age(){
		return 2017 - this.birthYear;
		
	}
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	public void input() throws IOException{
		
		System.out.println("Enter name");
		
		name=br.readLine();
		
		System.out.println("Enter birth Year");
		
		birthYear=Integer.parseInt(br.readLine());
	
		
		
	}
	
	public void output(){
		
		System.out.println(name + birthYear);
		
		
	}
	
	

		
		@Override
		public String toString() {
			return "Person [name=" + name + ", birthYear=" + birthYear + 
					",your age " + age() + "]";
		}
		
	
		public void changeName() throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name to change:");
			
			this.name = br.readLine();
			
			System.out.println(" Name changed");
		}
		
}
