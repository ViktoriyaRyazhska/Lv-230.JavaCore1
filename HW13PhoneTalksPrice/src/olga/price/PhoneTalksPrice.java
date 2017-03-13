package olga.price;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneTalksPrice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double c1;
		double c2;
		double c3;
		double t1;
		double t2;
		double t3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter c1 ");
		c1 = Double.parseDouble(br.readLine());
		System.out.println("Please enter c2 ");
		c2 = Double.parseDouble(br.readLine());
		System.out.println("Please enter c3 ");
		c3 = Double.parseDouble(br.readLine());
		System.out.println("Please enter t1 ");
		t1 = Double.parseDouble(br.readLine());
		System.out.println("Please enter t2 ");
		t2 = Double.parseDouble(br.readLine());
		System.out.println("Please enter t3 ");
		t3 = Double.parseDouble(br.readLine());
		
		System.out.println("Price of the first call - "+ (c1*t1));
		System.out.println("Price of the second call - "+ (c2*t2));
		System.out.println("Price of the third call - "+ (c3*t3));
		System.out.println("The total price of three calls - "+ ((c1*t1)+(c2*t2)+(c3*t3)));

	}

}
