package olga.age.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAge {
	
	public static void main(String[] args) throws IOException {
		
		String name;
		int age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name? ");
		name = br.readLine();
		
		System.out.println("What is your age, " + name + " ?");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("Your name is " + name + " and your age is " + age + ".");
		
		
	}

}
