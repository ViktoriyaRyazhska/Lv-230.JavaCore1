package olga.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double r; //radius
		double p; // perimeter
		double a; //area
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the radius ");
		r = Double.parseDouble(br.readLine());
		
		p = 2*r*Math.PI;
		a = Math.PI*r*r;
		
		System.out.println("Perimeter = " + p);
		System.out.println("Area = " + a);
	}

}
