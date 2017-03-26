package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter text:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();

		String[] t= text.split(" ");
		for (int i = 0; i < t.length; i++) {
			if (!t[i].isEmpty()) {
				String s = t[i]+" ";
				System.out.print(s);
			}
		}
	
		

	}

}
